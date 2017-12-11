<template>
  <div>
    <el-card>
      <el-input type="text" placeholder="账号" v-model="username" autofocus />
      <el-input type="password" placeholder="密码" v-model="password" />
      <el-button type="primary" icon="el-icon-check" @click="loginIn">登录</el-button>
    </el-card>
  </div>
</template>
<script>
export default {
  name: 'Login',
  data () {
    return {
      username: '',
      password: ''
    }
  },
  methods: {
    loginIn () {
      console.log('登录')
    }
  }
}
</script>
