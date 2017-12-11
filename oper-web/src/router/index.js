import Vue from 'vue'
import Router from 'vue-router'
import Login from '@/page/Login'
import Home from '@/page/Home'
import HelloWorld from '@/components/HelloWorld'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Login',
      component: Login
    },
    {
      path: '/home',
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
        }
      ]
    }
  ]
})
