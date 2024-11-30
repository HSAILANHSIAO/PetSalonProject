<template>
    <h3>修改</h3>
    <router-link to="/home2">回上一頁</router-link><br>
     第??筆:<input type="text" v-model="id"><br>
     名字:<input type="text" v-model="name"><br>
     手機:<input type="text" v-model="phone"><br>
     地址:<input type="text" v-model="address"><br>
     <button @click="update()">確定</button>
     <hr>
     {{ message }}
 </template>
 <script>
 import axios from 'axios'
 export default{
     name:'updatePet',
     data:function(){
         return{
             id:'',
             name:'',
             phone:'',
             address:'',
             message:''
         }
     },
     methods:{
         update(){
           let id=this.id;
           let name=this.name;
           let phone=this.phone;
           let address=this.address
           


             axios
             .put("http://localhost:8080/pet/UpdatePet/"+id+"/"+name+"/"+phone+"/"+address)
             .then(response=>this.message=response.data)
             .catch(function(error){
                 console.log("資訊有錯誤",error);
             })
         }
     }
 }
 
 </script>
 <style>
 </style>