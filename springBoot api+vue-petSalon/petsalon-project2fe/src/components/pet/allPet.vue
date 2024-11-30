<template>
    <h3>Pet membership 查詢會員</h3>
    <router-link to="/home2">回上一頁</router-link><br>
    <table width=100% border=1>
    <tr bgcolor=yellow>
        <td>id</td>
        <td>毛寶貝</td>
        <td>生日</td>
        <td>體重</td>
        <td>貓/狗</td>
        <td>手機</td>
        <td>地址</td>
    </tr>
    <tr v-for="c in info">
        <td>{{ c.id }}</td>
        <td>{{ c.name }}</td>
        <td>{{ c.birthday }}</td>
        <td>{{ c.weigh }}</td>
        <td>{{ c.sort }}</td>
        <td>{{ c.phone }}</td>
        <td>{{ c.address }}</td>
      
    </tr>

    </table>
   
</template>
<script>
    import axios from 'axios'
    export default{
        name:'allPet',
        data(){
            return{
                info:[]
            }
        },
        mounted(){
            let url="http://localhost:8080/pet/AllPet";
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