<template>
    <div class="login">
        <h2>Login</h2>
        <form action="/submit-your-login" method="post">
            <input type="text" placeholder="用户名" name="username" required>
            <input type="password" placeholder="密码" name="password" required>
            <button type="submit">登录</button>
        </form>
        <a href="#">Forgot Password?</a>
    </div>

</template>

<script lang="ts">
export default {
    name: "Login"
}
</script>
<script setup lang="ts">

</script>

<style scoped>
body {
    font-family: 'Arial', sans-serif;
    background-color: #f7f7f7;
}
.login {
    /* 页面水平垂直居中 */
    position: absolute;
    top: 20%;
    left: 42%;
    margin: 0 auto;
    height: 300px;
    background-color: #ffffff;
    padding: 20px;
    border-radius: 5px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    width: 300px;
}

.login h2 {
    text-align: center;
    color: #333;
}

.login input[type="text"],
.login input[type="password"] {
    width: 100%;
    padding: 10px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}

.login button {
    width: 100%;
    padding: 10px;
    background-color: #5c67f2;
    color: white;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    font-size: 16px;
}

.login button:hover {
    background-color: #4a54e1;
}

.login a {
    display: block;
    text-align: center;
    margin-top: 10px;
    color: #5c67f2;
    text-decoration: none;
}

.login a:hover {
    text-decoration: underline;
}
</style>
