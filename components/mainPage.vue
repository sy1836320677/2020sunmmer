<template>
  <el-container>
    <el-container direction="horizontal">
      <el-aside style="width: 650px"></el-aside>
      <span>welcome</span>
      <el-aside width="50px"></el-aside>
      <el-button type="danger" plain @click="quit">退出登录</el-button>
    </el-container>
    <el-header><navigation/></el-header><!--主页导航栏-->
    <div>
      <router-view/>
    </div>
  </el-container><!--主页面-->
</template>

<script>
import navigation from './navigation'
import login from './login'
import ChangeAccount from './home/changeAccount'
export default {
  name: 'mainPage',
  components: {
    ChangeAccount,
    navigation,
    login
  },
  data: function () {
    return {
      name: '',
      url_user: 'https://cube.elemecdn.com/0/88/03b0d39583f48206768a7534e55bcpng.png'
    }
  },
  methods: {
    quit () {
      this.$cookies.set('username', '')
      this.$cookies.set('password', '')
      this.$router.push('/login')
    }
  }
}
</script>

<style scoped>

</style>
