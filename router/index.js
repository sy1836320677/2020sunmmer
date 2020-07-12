import Vue from 'vue'
import Router from 'vue-router'
import login from '../components/login'
import person from '../components/person'
import goods from '../components/goodTX'
import borrow from '../components/borrow'
import publisharticle from '../components/publisharticle'
import mainPage from '../components/mainPage'
import register from '../components/register'
import rent from '../components/rent'
import goodAQY from '../components/goodAQY'
import goodInfoTX from '../components/goodInfo/goodInfoTX'
import goodInfoBiliBili from '../components/goodInfo/goodInfoBiliBili'
import goodInfoAQY from '../components/goodInfo/goodInfoAQY'
import goodInfoTXPay from '../components/goodInfo/goodInfoTXPay'
import payment from '../components/Payment/payment'
import goodB from '../components/goodB'
import goodInfoBD from '../components/goodInfo/goodInfoBD'
import goodBD from '../components/goodBD'
import goodJJ from '../components/goodJJ'
import goodWH from '../components/goodWH'
import goodLS from '../components/goodLS'
import goodYY from '../components/goodYY'
import tuijian from '../components/tuijian'
import dingdan from '../components/dingdan'
import gouwuche from '../components/gouwuche'
import rebang from '../components/rebang'
import haoyoutuijian from '../components/haoyoutuijian'
import change from '../components/change'
import forget from '../components/home/forget'
Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/Payment/payment',
      name: 'payment',
      component: payment
    },
    {
      path: '/goodInfoTXPay',
      name: 'goodInfoTXPay',
      component: goodInfoTXPay
    },
    {
      path: '/goodInfoAQY',
      name: 'goodInfoAQY',
      component: goodInfoAQY
    },
    {
      path: '/goodInfoBiliBili',
      name: 'goodInfoBiliBili',
      component: goodInfoBiliBili
    },

    {
      path: '/goodInfoBD',
      name: 'goodInfoBD',
      component: goodInfoBD
    },
    {
      path: '/goodInfoTX',
      name: 'goodInfoTX',
      component: goodInfoTX
    },
    {
      path: '/register',
      name: 'register',
      component: register
    },
    {
      path: '/forget',
      name: 'forget',
      component: forget
    },
    {
      path: '/login',
      name: 'login',
      component: login
    },
    {
      path: '/tuijian',
      name: 'tuijian',
      component: tuijian
    },
    {
      path: '/mainPage',
      name: 'mainPage',
      component: mainPage,
      children: [
        {
          path: '/person',
          name: 'person',
          component: person,
          children: [
            {
              path: '/change',
              name: 'change',
              component: change
            }
          ]
        },
        {
          path: '/goodBD',
          name: 'goodBD',
          component: goodBD
        },
        {
          path: '/goodJJ',
          name: 'goodJJ',
          component: goodJJ
        },
        {
          path: '/goodWH',
          name: 'goodWH',
          component: goodWH
        },
        {
          path: '/goodLS',
          name: 'goodLS',
          component: goodLS
        },
        {
          path: '/goodYY',
          name: 'goodYY',
          component: goodYY
        },
        {
          path: '/goodB',
          name: 'goodB',
          component: goodB
        },
        {
          path: '/goodAQY',
          name: 'goodAQY',
          component: goodAQY
        },
        {
          path: '/goods',
          name: 'goods',
          component: goods
        },
        {
          path: '/borrow',
          name: 'borrow',
          component: borrow
        },
        {
          path: '/rent',
          name: 'rent',
          component: rent
        },
        {
          path: '/publishArticle',
          name: 'publishArticle',
          component: publisharticle
        },
        {
          path: '/dingdan',
          name: 'dingdan',
          component: dingdan
        },
        {
          path: '/gouwuche',
          name: 'gouwuche',
          component: gouwuche
        },
        {
          path: '/haoyoutuijian',
          name: 'haoyoutuijian',
          component: haoyoutuijian
        },
        {
          path: '/rebang',
          name: 'rebang',
          component: rebang
        }
      ]
    } // 主页界面 first page after login
  ]
})
