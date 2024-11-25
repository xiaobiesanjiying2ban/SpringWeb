<template>
    <div class="register-container">
        <h2>Register</h2>
        <form action="/submit-your-registration" method="post">
            <div class="form-group">
                <label for="username">用户名</label>
                <input type="text" id="username" name="username" required>
            </div>
            <div class="form-group">
                <label for="email">邮箱</label>
                <input type="email" id="email" name="email" required>
            </div>
            <div class="form-group">
                <label for="password">密码</label>
                <input type="password" id="password" name="password" required>
            </div>
            <div class="form-group">
                <label for="confirm-password">确认密码</label>
                <input type="password" id="confirm-password" name="confirm-password" required>
            </div>
            <button type="submit">注册</button>
        </form>
        <a href="/login">Already have an account? Login here</a>
    </div>
</template>
<script lang="ts">
  export default {
    name: "Enroll"
}
</script>
<script setup lang="ts">

</script>

<style scoped>


 .register-container {
     background-color: #ffffff;
     position: absolute;
     left: 40%;
     top: 10%;
     margin: 0 auto;
     padding: 20px;
     border-radius: 8px;
     box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
     width: 350px;
 }

 .register-container h2 {
     text-align: center;
     color: #333;
     margin-bottom: 20px;
 }

 .form-group {
     margin-bottom: 15px;
 }

 .form-group label {
     display: block;
     margin-bottom: 5px;
     color: #666;
 }

 .form-group input {
     width: 100%;
     padding: 10px;
     border: 1px solid #ddd;
     border-radius: 4px;
     box-sizing: border-box;
 }

 .form-group input:focus {
     outline: none;
     border-color: #5c67f2;
 }

 .register-container button {
     width: 100%;
     padding: 10px;
     background-color: #5c67f2;
     color: white;
     border: none;
     border-radius: 4px;
     cursor: pointer;
     font-size: 16px;
 }

 .register-container button:hover {
     background-color: #4a54e1;
 }

 .register-container a {
     display: block;
     text-align: center;
     margin-top: 10px;
     color: #5c67f2;
     text-decoration: none;
 }

 .register-container a:hover {
     text-decoration: underline;
 }
</style>
