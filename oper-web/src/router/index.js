import Vue from 'vue'
import Router from 'vue-router'
import Login from '@/page/Login'
import Home from '@/page/Home'
import ArticleManage from '@/page/ArticleManage'
import UserManage from '@/page/UserManage'
import HelloWorld from '@/components/HelloWorld'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Home',
      component: Home,
      children: [
        {
          path: '/hello',
          name: 'HelloWorld',
          component: HelloWorld
        },
        {
          path: '/login',
          name: 'Login',
          component: Login
        },
        {
          path: '/article',
          name: 'ArticleManage',
          component: ArticleManage
        },
        {
          path: '/user',
          name: 'UserManage',
          component: UserManage
        }
      ]
    }
  ]
})
