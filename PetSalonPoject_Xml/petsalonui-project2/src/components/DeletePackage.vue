<template>
    <div class="com1">
        <h3>Petsalon刪除預約</h3>
      <el-input v-model="id" placeholder="請輸入ID"></el-input>
      <el-button type="prmary" @click="Delete">送出</el-button>
    </div>
   <hr>
   {{ message }}
  </template>
  <script>
  import axios from 'axios'
  export default{
    name:'DeletePackage',
    data:function(){
        return{
            id:'',
            message:''
        }
    },
    methods:{
        Delete(){
            let Id=this.id;
            axios 
            .delete("http://localhost:8080/PackageService/DeletePackageService/"+Id)
            .then(response=>this.message=response.data)
            .catch(function(error){
                console.log(error);
            });
        }
    }
  }
  
  
  </script>
  <style>
    .com1{
    width:70%;
    margin-left: 15%;
    margin-top: 20px;
  }

</style>