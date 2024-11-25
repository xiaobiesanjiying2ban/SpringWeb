<template>

  <div id="app">
    <!-- <Login></Login> -->
    <!-- <Home></Home> -->
     <router-view></router-view>
    <!-- <Enroll></Enroll> -->
  </div>

</template>
<script lang="ts">
export default {
  name: "app"
}
</script>

<script setup lang="ts">
import Home from './components/Home.vue'
import Login from './components/Login.vue'
import Enroll from './components/Enroll.vue'



</script>

<style scoped></style>
