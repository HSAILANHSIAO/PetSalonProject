<template>
     <router-link to="/home1">回上一頁</router-link><br>
    <table width=100% border=1>
    <tr bgcolor=yellow>
        <td>id</td>
        <td>手機</td>
        <td>商品名稱</td>
        <td>價格</td>
        <td>購買數量</td>
        <td>總金額</td>
    </tr>
    <tr v-for="c in info">
        <td>{{ c.id }}</td>
        <td>{{ c.phone }}</td>
        <td>{{ c.name }}</td>
        <td>{{ c.price }}</td>
        <td>{{ c.quantity }}</td>
        <td>{{ c.sum }}</td>
      
    </tr>

    </table>
   
</template>
<script>
    import axios from 'axios'
    export default{
        name:'allSupplier',
        data(){
            return{
                info:[]
            }
        },
        mounted(){
            let url="http://localhost:8080/supplier/allSupplier";
            axios
            .get(url)
            .then(response=>this.info=response.data)
            .catch(function(error){
                console.log(error);
            })
        }
    }
</script>
<style></style>