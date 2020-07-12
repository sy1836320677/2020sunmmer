<template>
  <div style="margin: 20px;">
    <user-avatar></user-avatar>
    <el-container style="width: 2400px;height: 50px; border: 1px solid #eee;text-align: center">
      <h1><i class="el-icon-s-custom"></i>用 户 名：{{info.username}}</h1>
    </el-container>
    <el-container style="width: 2400px;height: 50px; border: 1px solid #eee">
      <h1><i class="el-icon-phone"></i>联 系 电 话：{{info.phone}}</h1>
    </el-container>
    <el-container style="width: 2400px;height: 50px; border: 1px solid #eee">
      <h1><i class="el-icon-eleme"></i>邮 箱：{{info.email}} </h1>
    </el-container>
    <el-container style="width: 2400px;height: 50px; border: 1px solid #eee">
      <h1><i class="el-icon-money"></i>国 家：{{info.country}} </h1>
    </el-container>
    <el-popover
      placement="right"
      width="400"
      trigger="click">
      <change></change>
      <el-button slot="reference">
        <i class="el-icon-edit"></i>
        修改密码</el-button>
    </el-popover>
    <el-popover
      placement="right"
      width="600"
      trigger="click">
      <changeMyInfo/>
      <el-button slot="reference">
        <i class="el-icon-edit-outline"></i>
        修改个人信息
      </el-button>
    </el-popover>
    <el-button @click="refresh">
      <i class="el-icon-refresh"></i>
      刷新
    </el-button>
  </div>
</template>

<script>
import userAvatar from './userAvatar'
import upload from './upload'
import change from './change'
import changeMyInfo from './changeMyInfo'
import axios from 'axios'
export default {
  name: 'modifyPerson',
  data () {
    return {
      username: '',
      email: '',
      phone: '',
      squareUrl: 'https://cube.elemecdn.com/9/c2/f0ee8a3c7c9638a54940382568c9dpng.png',
      info: []
    }
  },
  components: {
    userAvatar,
    upload,
    change,
    changeMyInfo
  },
  mounted () {
    // eslint-disable-next-line no-return-assign
    axios.post('http://' + this.$ip + ':' + this.$port + '/getInfo').then(res => {
      console.log('账号信息')
      console.log(res)
      let jsonObj = JSON.parse(JSON.stringify(res))
      this.info = jsonObj.data.info
      console.log(this.info)
    }).catch(error => {
      console.log(error)
    })
  },
  methods: {
    refresh () {
      // eslint-disable-next-line no-return-assign
      axios.post('http://' + this.$ip + ':' + this.$port + '/getInfo').then(res => {
        console.log('账号信息')
        console.log(res)
        let jsonObj = JSON.parse(JSON.stringify(res))
        this.info = jsonObj.data.info
        console.log(this.info)
      }).catch(error => {
        console.log(error)
      })
    }
  }
}
</script>

<style scoped>

</style>
