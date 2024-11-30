<template>
    <h3>修改</h3>
    <router-link to="/home1">回上一頁</router-link><br>
     第??筆:<input type="text" v-model="id"><br>
     更正數量:<input type="text" v-model="quantity"><br>
     總金額:<input type="text" v-model="sum"><br>
     <button @click="update()">確定</button>
     <hr>
     {{ message }}
 </template>
 <script>
 import axios from 'axios'
 export default{
     name:'updateSupplier',
     data:function(){
         return{
             id:'',
             quantity:'',
             sum:'',
             message:''
         }
     },
     methods:{
         update(){
             let id=this.id;
             let quantity=this.quantity;
             let sum=this.sum;
 
             axios
             .put("http://localhost:8080/supplier/updateSupplier/"+id+"/"+quantity+"/"+sum)
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