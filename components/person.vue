<template>
  <el-tabs v-model="activeName" type="card" @tab-click="handleClick" tab-position="top">
    <el-tab-pane label="用户个人信息管理" name="first" >
      用户管理
      <modify-person>
      </modify-person>
    </el-tab-pane>
    <el-tab-pane label="我的账户" name="seventh">
      <el-container direction="vertical">
        <el-container>
          <el-image
            style="width: 20px; height: 20px;"
            :src="moneySRC"
          >
          </el-image><span>账户余额 :{{money}} 元</span>
        </el-container>
        <el-button style="width: 100px" @click="chongzhi">充值</el-button>
      </el-container>
    </el-tab-pane>
  </el-tabs>
</template>
<script>import foodItem from './foodItem'
import modifyPerson from './modifyPerson'
import mailbox from './mailbox'
import scoreAndAchievement from './scoreAndAchievement'
import axios from 'axios'
import mySubscription from './mySubscription'
export default {
  data () {
    return {
      chongzhiNum: 1,
      money: '',
      activeName: 'first',
      foodHistorys: [],
      foodCollections: [],
      subs: [],
      content: '',
      toId: '',
      msgContent: '',
      dialogFormVisible: false,
      moneySRC: 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1592137260978&di=4f6581118f94441fc398c755caceb42d&imgtype=0&src=http%3A%2F%2Fpic.sucaibar.com%2Fpic%2F201307%2F05%2F09a1778bc8.png'
    }
  },
  methods: {
    accountInfo (account, name, outline, detail, press, author, translator, price, imageurl) {
      console.log(account)
      this.$router.push({
        path: '/goodInfoAQY',
        query: {
          account: account,
          name: name,
          outline: outline,
          detail: detail,
          press: press,
          author: author,
          translator: translator,
          price: price,
          image_url: imageurl
        }
      })
    },
    chongzhi () {
      this.$router.push('/Payment/payment')// 跳转到支付界面
    },
    handleClick (tab, event) {
      console.log(tab, event)
    },
    open (value) {
      this.toId = value
      this.dialogFormVisible = true
    },
    postMail () {
      let params = new URLSearchParams()
      params.append('msg', this.msgContent)
      params.append('to', this.toId)
      axios.post('http://' + this.$ip + ':' + this.$port + '/send_message', params).then(res => {
        console.log('successfully sent message')
        this.dialogFormVisible = false
        alert('发送成功')
        this.form.content = ''
      })
    }
  },
  components: {
    foodItem,
    modifyPerson,
    mailbox,
    scoreAndAchievement,
    mySubscription
  },
  mounted () {
    axios.post('http://' + this.$ip + ':' + this.$port + '/showcar').then(res => {
      console.log('money')
      console.log(res)
      let jsonObj = JSON.parse(JSON.stringify(res))
      console.log(jsonObj)
      this.money = jsonObj.data.money
      this.pagesum = Math.ceil(jsonObj.data.list.length / this.eachpage)
      console.log(this.accounts)
    }).catch(error => {
      console.log(error)
    })
  }
}
</script>
