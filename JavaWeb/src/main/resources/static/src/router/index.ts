// 引入createRounter
import { createRouter, createWebHistory } from 'vue-router'
// 导入组件
import Login from '../components/Login.vue'
import Home from '../components/Home.vue'
import Enroll from '../components/Enroll.vue'

// 创建路由
const router = createRouter({
    history: createWebHistory(),//路由器的工作模式 
    routes: [   //路由数组
        // 首页路由
        {
            name: 'Home',
            path: '',
            component:Home
        },
        // 登录页面
        {
            name: 'Login',
            path: '/Login',
            component: Login
        },
        //注册界面
        {
            name: 'Enroll',
            path: '/Enroll',
            component: Enroll
        }
    ]
})

// 暴露路由
export default router
