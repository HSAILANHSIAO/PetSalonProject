<template>
    <div class="com1"></div>
    <h2>Petsalon更正資訊</h2>
    <el-input v-model="id" placeholder="輸入ID"></el-input>
    <el-input v-model="name" placeholder="更改名字"></el-input>
    <el-input v-model="reservation" placeholder="更改日期"></el-input>
    <el-button @click="update">送出</el-button>
    <hr>
    {{ message }}
  </template>
  <script>
  import axios from 'axios'
  export default{
    name:'UpdatePackage',
    data:function(){
        return{
            id:'',
            name:'',
            reservation:'',
            message:''
        }
    },
    methods:{
        update(){
        const updatedData = {
        id: this.id,
        name: this.name,
        reservation: this.reservation
      };
            axios
            .put("http://localhost:8080/PackageService/UpdatePackageService",updatedData)
            .then(response=>this.message=response.data)
            .catch(function(error){
                console.log(error);
            })
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