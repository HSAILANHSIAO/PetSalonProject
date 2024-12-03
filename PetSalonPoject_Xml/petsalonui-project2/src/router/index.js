import {createRouter,createWebHistory} from 'vue-router'
import AddPackage from '@/components/AddPackage.vue'
import AllPackage  from '@/components/AllPackage.vue'
import UpdatePackage from '@/components/UpdatePackage.vue'
import DeletePackage from '@/components/DeletePackage.vue'




const routes=[
    {path:'/addpackage',component:AddPackage},
    {path:'/allpackage',component:AllPackage},
    {path:'/updatepackage',component:UpdatePackage},
    {path:'/deletepackage',component:DeletePackage},
   
    
];

const router=createRouter({
    history:createWebHistory(),
    routes
});


export default router;