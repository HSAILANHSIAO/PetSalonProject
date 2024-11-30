import{createRouter,createWebHistory} from 'vue-router'
import Home from '../components/Home.vue'
import addPackageService from '../components/addPackageService.vue'
import allPackageservice from '../components/allPackageservice.vue'
import UpdatePackage from '../components/UpdatePackage.vue'
import DeletePackage from '../components/DeletePackage.vue'
import Home1 from '../components/supplier/Home1.vue'
import addSupplier from '../components/supplier/addSupplier.vue'
import allSupplier from '../components/supplier/allSupplier.vue'
import updateSupplier from '../components/supplier/updateSupplier.vue'
import Home2 from '../components/pet/Home2.vue'
import addPet from '../components/pet/addPet.vue'
import allPet from '../components/pet/allPet.vue'
import updatePet from '../components/pet/updatePet.vue'
import deletePet from '../components/pet/deletePet.vue'

const routes=[
  {path:'/',component:Home},
  {path:'/addpackageservice',component:addPackageService},
  {path:'/addpetallpackageservice',component:allPackageservice},
  {path:'/updatepackage',component:UpdatePackage},
  {path:'/deletepackage',component:DeletePackage},
  {path:'/addsupplier',component:addSupplier},
  {path:'/allsupplier',component:allSupplier},
  {path:'/updatesupplier',component:updateSupplier},
  {path:'/home1',component:Home1},
  {path:'/home2',component:Home2},
  {path:'/addpet',component:addPet},
  {path:'/allpet',component:allPet},
  {path:'/updatepet',component:updatePet},
  {path:'/deletepet',component:deletePet}

];

const router=createRouter({
    history:createWebHistory(),
    routes

});

export default router;
