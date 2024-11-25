import './assets/main.css'

import { createApp } from 'vue'
import { createPinia } from 'pinia'
// 引入element
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'

// 引入路由器
import router from './router/index'



import App from './App.vue'
const app = createApp(App)

app.use(ElementPlus)
app.use(createPinia())
app.use(router)
app.mount('#app')

