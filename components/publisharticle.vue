<template>
  <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="150px" class="demo-ruleForm">
    <el-form-item>
      <el-container>
        <el-header height="50px" class="header">
          发布图书信息
        </el-header>
      </el-container>
    </el-form-item>
    <el-form-item label="图书名称" prop="account">
      <el-input class="inputbox" v-model="ruleForm.account" placeholder="请输入内容"></el-input>
    </el-form-item>
    <el-form-item label="概述" prop="account">
      <el-input class="inputbox" v-model="ruleForm.password" placeholder="请输入内容" ></el-input>
    </el-form-item>
    <el-form-item label="出版社" prop="account">
      <el-input class="inputbox" v-model="ruleForm.chubanshe" placeholder="请输入内容"></el-input>
    </el-form-item>
    <el-form-item label="作者" prop="account">
      <el-input class="inputbox" v-model="ruleForm.author" placeholder="请输入内容"></el-input>
    </el-form-item>
    <el-form-item label="价格" prop="price">
      <el-input class="inputbox" v-model="ruleForm.price" placeholder="请输入内容" ></el-input>
    </el-form-item>
    <el-form-item label="图书详情" prop="desc">
      <el-input type="textarea" v-model="ruleForm.desc"></el-input>
    </el-form-item>
    <el-form-item>
      <el-button type="primary" @click="submitForm('ruleForm')">立即发布</el-button>
      <el-button @click="resetForm('ruleForm')">重置</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
import upload from './upload'
import axios from 'axios'
export default {
  components: {
    upload
  },
  data () {
    return {
      ruleForm: {
        options: [{
          name: '腾讯视频',
          label: '腾讯视频'
        }, {
          name: '爱奇艺视频',
          label: '爱奇艺视频'
        }, {
          name: '哔哩哔哩',
          label: '哔哩哔哩'
        }, {
          name: '百度网盘',
          label: '百度网盘'
        }],
        name: '',
        region: '',
        date1: '',
        date2: '',
        delivery: false,
        type: [],
        resource: '',
        desc: '',
        account: '',
        password: '',
        price: 1
      },
      rules: {
        name: [
          { required: true, message: '请输入账号名称(百度网盘,腾讯会员等)', trigger: 'blur' },
          { min: 3, max: 5, message: '长度在 3 到 5 个字符', trigger: 'blur' }
        ],
        type: [
          { type: 'array', required: true, message: '请至少选择一个账号标签', trigger: 'change' }
        ],
        desc: [
          { required: true, message: '请输入图书详情', trigger: 'blur' }
        ],
        account: [
          { required: true, message: '请输入图书名称', trigger: 'blur' }
        ],
        password: [
          { required: true, message: '请填写内容', trigger: 'blur' }
        ],
        price: [
          { required: true, message: '请输入价格', trigger: 'blur' }
        ]
      }
    }
  },
  methods: {
    submitForm (formName) {
      this.$refs[formName].validate((valid) => {
        if (valid) {
          var params = new URLSearchParams()
          params.append('name', this.ruleForm.account)
          params.append('outline', this.ruleForm.password)
          params.append('press', this.ruleForm.chubanshe)
          params.append('author', this.ruleForm.author)
          params.append('price', this.ruleForm.price)
          params.append('detail', this.ruleForm.desc)
          // post表单
          axios.post('http://' + this.$ip + ':' + this.$port + '/managesj', params).then(res => {
            // eslint-disable-next-line eqeqeq
            if (res.data.code == 0) { // 判断登录返回值code，0则成功，其他则失败
              console.log('发布返回')
              console.log(res)
              alert('发布账号租借信息成功')
              this.$router.push({path: '/mainPage'})
            } else {
              alert('发布账号租借信息失败')
            }
          }).catch(error => {
            alert('错误或超时')
            console.log(error)
          })
        }
      })
    },
    resetForm (formName) {
      this.$refs[formName].resetFields()
    },
    handleChange (value) {
      console.log(value)
    }
  }
}
</script>
<style>

</style>
