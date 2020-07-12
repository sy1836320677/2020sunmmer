<template>
  <el-container style="height: 500px; border: 1px solid #eee">
    <el-container>
      <el-header style="text-align: center; font-size: 24px">订单列表</el-header>
        <el-container>
          <li v-for="dingdan in dingdans.slice((currpage-1)*eachpage,currpage*eachpage)" :key="dingdan.id">
            <div>
              <el-container style=" border: 1px solid #eee; text-align: center">
                <div id="app">
                  <div class="demo-image">
                    <span class="demonstration">{{ fit }}</span>
                    <el-container direction="vertical">
                      <el-image
                        style="width: 220px; height: 220px"
                        :src="url"
                        :fits="fit"
                      ></el-image>
                      <el-container direction="vertical">
                        <el-container>
                          <el-avatar shape="square" :size="30" :fit="fit" :src="url"></el-avatar>
                          <div>{{dingdan.bookName}}</div>
                        </el-container>
                        <el-container>
                          <el-tag>{{dingdan.unitPrice}} </el-tag>
                          <el-tag type="success">订单号:{{dingdan.orderId}}</el-tag>
                          <el-tag type="info">(1为未发货，2为已发货){{dingdan.postStatus}}</el-tag>
                        </el-container>
                      </el-container>
                    </el-container>
                  </div>
                </div>
              </el-container>
            </div>
          </li>
        </el-container>
        <div>
          <el-button v-if="currpage>1" @click="currpage--" type="primary" icon="el-icon-arrow-left">上一页</el-button>
          <span>{{currpage}}</span>/<span>{{pagesum}}</span>
          <el-button v-if="currpage<pagesum" @click="currpage++" type="primary">下一页<i class="el-icon-arrow-right el-icon--right"></i></el-button>
        </div>
    </el-container>
  </el-container>
</template>

<script>
import foodItem from './foodItem'
import mainPageAside from './mainPageAside'
import axios from 'axios'

export default {
  name: 'dingdan',
  methods: {
    accountInfo (account, name, outline, detail, press, author, translator, price, imageurl) {
      console.log(account)
      this.$router.push({path: '/goodInfoAQY',
        query: {
          account: account,
          name: name,
          outline: outline,
          detail: detail,
          press: press,
          author: author,
          translator: translator,
          price: price,
          image_url: imageurl}})
    }
  },
  data () {
    return {
      accounts: [],
      url: 'https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2403157591,3901429885&fm=26&gp=0.jpg',
      url_user: 'https://cube.elemecdn.com/0/88/03b0d39583f48206768a7534e55bcpng.png',
      // 默认显示第几页
      currpage: 1,
      // 总条数，根据接口获取数据长度(注意：这里不能为空)
      pagesum: 1,
      // 默认每页显示的条数（可修改）
      eachpage: 8,
      dingdans: []
    }
  },
  mounted () {
    axios.post('http://' + this.$ip + ':' + this.$port + '/showdd').then(res => {
      console.log('订单列表')
      console.log(res)
      let jsonObj = JSON.parse(JSON.stringify(res))
      console.log(jsonObj)
      this.accounts = jsonObj.data.list
      this.dingdans = jsonObj.data.orderDetails
      this.pagesum = Math.ceil(jsonObj.data.list.length / this.eachpage)
      console.log(this.accounts)
    }).catch(error => {
      console.log(error)
    })
  },
  components: {
    foodItem,
    mainPageAside}
}
</script>

<style scoped>

</style>
