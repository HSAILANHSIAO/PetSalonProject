<template>
<div ip="app">
  <div class="header"><h1>Petsalon</h1>
    
  </div>
  <div class="nav">
    <router-link to="/">預約表</router-link>&nbsp
    <router-link to="/home1">購買資訊</router-link>&nbsp
    <router-link to="/home2">會員資料</router-link>&nbsp

    

  </div>
  <div class="content">
    
    <div>
      <router-view></router-view>
    </div>

  </div>

  <div class="footer"></div>
  </div>



</template>
<script>
</script>
<style>
.header{
  width:55%;
  height:100px;
  background-color:#f7ee88e1;
  margin-left:25%;
  color:#38b5e2;
}
.nav{
  width:55%;
  height:50px;
  background-color:#ddf6f5;
  margin-left:25%;
  color:#FFFFFF;
}
.content{
  width:55%;
  height:450px;
  background-color:#eb54b651;
  margin-left:25%;
  
}
.footer{
  width:55%;
  height:50px;
  background-color:#ddf6f5;
  margin-left:25%;
  color:#FFFFFF;
}



</style>