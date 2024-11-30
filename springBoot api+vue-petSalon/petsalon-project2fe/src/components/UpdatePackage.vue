<template>
    <h2>Petsalon更改日期</h2>
    <router-link to="/">回上一頁</router-link><br>
    第??筆:<input type="text" v-model="id"><br>
    更改日期:<input type="text" v-model="reservation"><br>
    <button @click="update()">確定</button>
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
            reservation:'',
            message:''
        }
    },
    methods:{
        update(){
            let id=this.id;
            let reservation=this.reservation;

            axios
            .put("http://localhost:8080/packageservice/updatePackageService/"+id+"/"+reservation)
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