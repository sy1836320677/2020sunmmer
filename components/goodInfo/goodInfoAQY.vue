<template>
  <el-container direction="vertical">
    <el-page-header @back="goBack" content="详情页面">
    </el-page-header>
    <el-container>
      <el-aside width="200px" >
        <div class="demo-image__placeholder">
          <div class="block">
            <el-image :src="this.$route.query.image_url"></el-image>
            <el-image
              style="width: 220px; height: 220px"
              :src="this.src"
              :fits="fit"
              @click="accountInfo()"
            ></el-image>
          </div>
        </div>
      </el-aside><!--账号图片-->
      <div style="margin: 40px"></div>
      <el-main><!--账号信息区域-->
        <div style="margin: 20px;"></div>
        <el-form :label-position="left" label-width="120px" :model="formLabelAlign">
          <el-form-item label="图书名称">
            <el-divider direction="vertical"></el-divider>
            <span>{{this.$route.query.name}}</span>
          </el-form-item>
          <el-form-item label="概述">
            <el-divider direction="vertical"></el-divider>
            <span>{{this.$route.query.outline}}</span>
          </el-form-item>
          <el-form-item label="图书详情">
            <el-divider direction="vertical"></el-divider>
            <span>{{this.$route.query.detail}}</span>
          </el-form-item>
          <el-form-item label="出版社">
            <el-divider direction="vertical"></el-divider>
            <span>{{this.$route.query.press}}</span>
          </el-form-item>
          <el-form-item label="作者">
            <el-divider direction="vertical"></el-divider>
            <span>{{this.$route.query.author}}</span>
          </el-form-item>
          <el-form-item label="价格">
            <el-divider direction="vertical"></el-divider>
            <span>{{this.$route.query.price}}</span>
          </el-form-item>
        </el-form>
        <el-popconfirm
          confirmButtonText='发送订单'
          cancelButtonText='不用了'
          icon="el-icon-info"
          iconColor="red"
          title="确认发起订单？"
          @onConfirm="borrow"
        >
          <el-button slot="reference">发送订单</el-button>
        </el-popconfirm>
        <el-popconfirm
          confirmButtonText='添加到购物车'
          cancelButtonText='不用了'
          icon="el-icon-info"
          iconColor="red"
          title="确认添加到购物车？"
          @onConfirm="gouwuche"
        >
          <el-button slot="reference">添加到购物车</el-button>
        </el-popconfirm>
      </el-main>
    </el-container>
  </el-container>
</template>

<script>import axios from 'axios'
export default {
  name: 'goodInfoAQY',
  methods: {
    accountInfo () {
      console.log(this.$route.query.bookId)
      this.$router.push({
        path: '/tuijian',
        query: {bookId: this.$route.query.bookId
        }})
    },
    goBack () {
      this.$router.push('/mainPage')
    },
    borrow () {
      var params = new URLSearchParams()
      params.append('rentid', this.$route.query.name)
      axios.post('http://' + this.$ip + ':' + this.$port + '/dingdan', params).then(res => {
        if (res.data.code === 0) {
          console.log('订单成功')
          console.log(res)
          alert('订单成功')
        } else {
          console.log('余额不足')
          console.log(res)
          alert('余额不足')
        }
        this.$router.push('/mainPage')
      }).catch(error => {
        console.log(error)
      })
    },
    gouwuche () {
      var params = new URLSearchParams()
      params.append('rentid', this.$route.query.name)
      axios.post('http://' + this.$ip + ':' + this.$port + '/shopcar', params).then(res => {
        if (res.data.code === 0) {
          console.log('添加到购物车')
          console.log(res)
          alert('添加到购物车')
        } else {
          alert('已添加到购物车')
        }
        this.$router.push('/mainPage')
      }).catch(error => {
        console.log(error)
      })
    }
  },
  data () {
    return {
      src: 'https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=207956772,160403120&fm=26&gp=0.jpg',
      type: '爱奇艺会员',
      owner: 'JACK',
      time: 1,
      when: '2020.6.6',
      info: '出租意向',
      name: ''
    }
  }
}
</script>

<style scoped>

</style>
