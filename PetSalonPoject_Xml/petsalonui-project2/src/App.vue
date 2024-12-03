<template>
  <div id="app">
    <header><h1>PetSalon</h1></header>
    <aside>
      <div class="asideIn">
        <h3 class="item"><router-link to="/allpackage"><el-button type="primary">查詢紀錄</el-button></router-link></h3>
        <h3 class="item"><router-link to="/addpackage"><el-button type="primary">新增</el-button></router-link></h3>
        <h3 class="item"><router-link to="/updatepackage"><el-button type="primary">修改</el-button></router-link></h3>
        <h3 class="item"><router-link to="/deletepackage"><el-button type="primary">刪除</el-button></router-link></h3>
       
      </div>
    </aside>
    <main><router-view></router-view></main>
    <footer><h1>CONNIE </h1></footer>
  </div>
  
  </template>
  <script></script>
  <style>

  @charset "UTF-8";
  *{
    margin: 0;
    padding: 0;
  }
  body{
    width: 100%;
    min-width:600px;
    max-width:960px;
    background:beige;
    margin: 0 auto;
  }
  header{
    width: 100%;
    background: #77f4f4;
  
    color:white;
  }
  main{
    width:70%;
    height: 300px;
    background: #f7c9e7;
    float: right;
  }
  aside{
    width: 28%;
    height: 300px;
    background: #f7c9e7;
    float: left;
  }
  .asideIn{
    margin-left: 80px;
    margin-top: 30px;
  }
  .item{
    margin-top: 5px;
  }
  footer{
    width: 100%;
    background: #77f4f4;
    clear: both;
    
    color:white;
  }
</style>