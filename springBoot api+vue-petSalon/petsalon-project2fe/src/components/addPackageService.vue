<template>
     <h2>Petsalon預約表</h2>
     <router-link to="/">回上一頁</router-link>&nbsp
    <div>
    毛寶貝:<input type="text" v-model="name"><br>
    付款方式:<input type="text" v-model="payer"><br>
    預約日期:<input type="text" v-model="reservation"><br>
    預約時間:<input type="text" v-model="time"><br>
    沙龍項目:<input type="text" v-model="salon"><br>
    手機:<input type="text" v-model="phone"><br>
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
            payer:'',
            reservation:'',
            time:'',
            salon:'',
            phone:'',
            mesage:''
        }
    },
    methods:{
        add(){
            var data={
                name:this.name,
                payer:this.payer,
                reservation:this.reservation,
                time:this.time,
                salon:this.salon,
                phone:this.phone
            };
            var url="http://localhost:8080/packageservice/addPackageService";

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