<template>
    <div class="com">
        <el-table :data="currentTableData" border style="width: 100%">
            <el-table-column prop="id" label="id" ></el-table-column>
             <el-table-column prop="name" label="毛寶貝" ></el-table-column>
             <el-table-column prop="payer" label="付款方式"></el-table-column>
             <el-table-column prop="reservation" label="預約日期"></el-table-column>
             <el-table-column prop="time" label="預約時間"></el-table-column>
             <el-table-column prop="salon" label="沙龍服務"></el-table-column>
             <el-table-column prop="phone" label="手機"></el-table-column>
         </el-table>

       <div style="margin-top: 25px; text-align: right;" class="com2">
        <el-pagination
            @size-chang="handleSizeChange"
            @current-change="handleCurrentChange"
            :current-page="currentPage"
            :page-size="pageSize"
            layout="total, prey, pager, next,jumper"
            :total="info.length"

        >
    </el-pagination>
    
    </div>

   </div> 
   </template>
   <script>
  import axios from 'axios'
     export default{
         name:'AllChat',
         data(){
             return {
                 info:[],
                 currentPage: 1,
                 pageSize: 4,
             }
         },

     mounted(){
       axios
       .get("http://localhost:8080/PackageService/AllPackageService")
       .then(response=>this.info=response.data)
       .catch(function(error){
         console(error);
       });
     },
     computed:{
             currentTableData() {
                         const start = (this.currentPage - 1) * this.pageSize;
                         const end = this.currentPage * this.pageSize;
                         return this.info.slice(start, end);
                         },
         },
         methods:{
             handleSizeChange(val) {
                     this.pageSize = val;
                     this.currentPage = 1; // 重置到第一頁
                 },
                 handleCurrentChange(val) {
                      this.currentPage = val;
                 },
         }
         
     }
 </script>
   <style>
     .com{
         width:100%;
         margin-left:0%;
         margin-top: 8px;
     }
     .com2
     {
         width: 90%;
         margin-left: 8%;
        
     }


</style>