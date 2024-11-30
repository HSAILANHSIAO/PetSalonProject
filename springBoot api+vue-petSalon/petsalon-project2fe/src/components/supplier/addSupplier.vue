<template>
     <router-link to="/home1">回上一頁</router-link><br>
    <div>
    手機:<input type="text" v-model="phone"><br>
    商品名稱:<input type="text" v-model="name"><br>
    價錢:<input type="text" v-model="price"><br>
    購買數量:<input type="text" v-model="quantity"><br>
    總金額:<input type="text" v-model="sum"><br>
    <button @click="add">新增</button>
    
    </div>
</template>
<script>

import axios from 'axios'

export default{
    name:'addSupplier',
    data(){
        return{
            phone:'',
            name:'',
            price:'',
            quantity:'',
            sum:'',
            mesage:''
        }
    },
    methods:{
        add(){
            var data={
                phone:this.phone,
                name:this.name,
                price:this.price,
                quantity:this.quantity,
                sum:this.sum,
                
            };
            var url="http://localhost:8080/supplier/addSupplier";

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