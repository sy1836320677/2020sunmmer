<template>
  <div>
    <el-menu :default-active="activeIndex" class="el-menu-demo" mode="horizontal" @select="handleSelect">
      <el-menu-item index="1"><router-link to="/goods">图书列表</router-link></el-menu-item>
      <el-menu-item index="2"><router-link to="/borrow">推荐图书</router-link></el-menu-item>
      <el-menu-item index="3"><router-link to="/rent">我的上架</router-link></el-menu-item>
      <el-menu-item index="4"><router-link to="/publishArticle">我要上架</router-link></el-menu-item>
      <el-menu-item index="5"><router-link to="/person">个人中心</router-link></el-menu-item>
    </el-menu>
  </div>
</template>

<script>
export default {
  name: 'navigation'
}
</script>

<style scoped>

</style>
