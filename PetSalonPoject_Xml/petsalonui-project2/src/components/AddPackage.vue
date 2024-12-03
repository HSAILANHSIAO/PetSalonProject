<template>
    <div>
     <el-input v-model="name" placeholder="毛寶貝"></el-input>
     <el-input v-model="payer" placeholder="付款方式"></el-input>
     <el-input v-model="reservation" placeholder="預約日期"></el-input>
     <el-input v-model="time" placeholder="時間"></el-input>
     <el-input v-model="salon" placeholder="沙龍服務"></el-input>
     <el-input v-model="phone" placeholder="手機"></el-input>
      <button @click="add">送出</button>
      <hr>
      {{ message }}  
    
    </div>

  </template>
  <script>
  import axios from 'axios'
  export default{
    name:'AddPackage',
    data(){
      return{
        name:'',
        payer:'',
        reservation:'',
        time:'',
        salon:'',
        phone:'',
        message:''
      }
    },
    methods:{
      add(){
        let data={
          "name":this.name,
          "payer":this.payer,
          "reservation":this.reservation,
          "time":this.time,
          "salon":this.salon,
          "phone":this.phone
        };
        let url="http://localhost:8080/PackageService/AddPackageSerivce";

        axios.post(url,data)
        .then(response=>this.message=response.data)
        .catch(function(error){
          console.log(error);
        })
      }
    }
  }

</script>
  <style>
    .com{
        width:70%;
        margin-left: 15%;
        margin-top:20px;
    }
</style>