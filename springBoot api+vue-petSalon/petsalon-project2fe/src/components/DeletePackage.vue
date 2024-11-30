<template>
    <h2>Petsalon取消訂單</h2>
    <router-link to="/">回上一頁</router-link><br>
   第??筆<input type="text" v-model="id"><br>
   <button @click="Delete">確定</button>
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
            let url="http://localhost:8080/packageservice/daletePackageService/"+Id;

            axios 
            .delete(url)
            .then(response=>this.message=response.data)
            .catch(function(error){
                console.log("刪除資訊有錯",error);
            });
        }
    }
}


</script>
<style></style>