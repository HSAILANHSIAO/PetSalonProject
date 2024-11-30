<template>
     <h2>Petsalon預約表</h2>
     <router-link to="/">回上一頁</router-link>&nbsp
    <table width=100% border=1>
    <tr bgcolor=yellow>
        <td>id</td>
        <td>毛寶貝</td>
        <td>付款方式</td>
        <td>預約日期</td>
        <td>預約時間</td>
        <td>沙龍項目</td>
        <td>手機</td>
    </tr>
    <tr v-for="c in info">
        <td>{{ c.id }}</td>
        <td>{{ c.name }}</td>
        <td>{{ c.payer }}</td>
        <td>{{ c.reservation }}</td>
        <td>{{ c.time }}</td>
        <td>{{ c.salon }}</td>
        <td>{{ c.phone }}</td>

    </tr>

    </table>
   
</template>
<script>
    import axios from 'axios'
    export default{
        name:'allPackageservice',
        data(){
            return{
                info:[]
            }
        },
        mounted(){
            let url="http://localhost:8080/packageservice/allPackageservice";
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