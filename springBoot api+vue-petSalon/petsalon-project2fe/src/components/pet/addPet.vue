<template>
    <h3>Pet membership 會員資料</h3>
    <router-link to="/home2">回上一頁</router-link><br>
   <div>
   毛寶貝:<input type="text" v-model="name"><br>
   出生日:<input type="text" v-model="birthday"><br>
   體重:<input type="number" v-model="weigh"><br>
   狗/貓:<input type="text" v-model="sort"><br>
   手機:<input type="text" v-model="phone"><br>
   地址:<input type="text" v-model="address"><br>
   <button @click="add">新增</button>
   </div>
</template>
<script>

import axios from 'axios'

export default{
   name:'addPackageService',
   data(){
       return{
           name:'',
           birthday:'',
           weigh:'',
           sort:'',
           phone:'',
           address:''
       }
   },
   methods:{
       add(){
           var data={
               name:this.name,
               birthday:this.birthday,
               weigh:this.weigh,
               sort:this.sort,
               phone:this.phone,
               address:this.address
           };
           var url="http://localhost:8080/pet/AddPet";

           axios
           .post(url,data)
           .then(response=>this.message=response.data)
           .catch(function(error){
               console.log("新增錯誤,error");
           })
       }
   }
}




</script>
<style></style>