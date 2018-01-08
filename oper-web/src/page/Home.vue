<template>
  <el-container>
    <el-aside>
      <el-menu :default-openeds="['1']">
        <el-menu-item index="1">
          <router-link to="/">Home</router-link>
        </el-menu-item>
        <el-menu-item index="2">
          <router-link to="/hello">Hello</router-link>
        </el-menu-item>
        <el-menu-item index="3">
          <router-link to="/login">Login</router-link>
        </el-menu-item>
        <el-menu-item index="4">
          <router-link to="/article">ArticleManage</router-link>
        </el-menu-item>
        <el-menu-item index="5">
          <router-link to="/user">UserManage</router-link>
        </el-menu-item>
      </el-menu>
    </el-aside>
    <el-header>
      <span>Jack</span>
    </el-header>
    <el-main>
      <router-view></router-view>
    </el-main>
  </el-container>
</template>
