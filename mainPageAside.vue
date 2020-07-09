<template>
  <el-aside width="200px" style="background-color: rgb(238, 241, 246)">
    <el-menu :default-openeds="['1', '3']">
      <el-submenu index="1">
        <template slot="title"><i class="el-icon-message"></i>图书列表</template>
        <el-menu-item-group>
          <el-menu-item index="1-1" @click="AQY">哲学宗教类</el-menu-item>
          <el-menu-item index="1-2" @click="TX">科学类</el-menu-item>
          <el-menu-item index="1-3" @click="BILI">政治法律类</el-menu-item>
          <el-menu-item index="1-1" @click="BD">军事类</el-menu-item>
          <el-menu-item index="1-1" @click="JJ">经济类</el-menu-item>
          <el-menu-item index="1-1" @click="WH">文化教育体育类</el-menu-item>
          <el-menu-item index="1-1" @click="LS">历史类</el-menu-item>
          <el-menu-item index="1-1" @click="YY">医药卫生类</el-menu-item>
        </el-menu-item-group>
      </el-submenu>
      <el-submenu index="2">
        <template slot="title"><i class="el-icon-setting"></i>其他图书</template>
      </el-submenu>
    </el-menu>
  </el-aside>
</template>
<script>
export default {
  name: 'mainPageAside',
  methods: {
    AQY () {
      this.$router.push({path: '/goodAQY'})
    },
    TX () {
      this.$router.push({path: '/goods'})
    },
    BILI () {
      this.$router.push({path: '/goodB'})
    },
    BD () {
      this.$router.push({path: '/goodBD'})
    },
    JJ () {
      this.$router.push({path: '/goodJJ'})
    },
    WH () {
      this.$router.push({path: '/goodWH'})
    },
    LS () {
      this.$router.push({path: '/goodLS'})
    },
    YY () {
      this.$router.push({path: '/goodYY'})
    }
  }
}
</script>

<style scoped>

</style>
