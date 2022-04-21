<template>
  <div id="app">
    <NavHeader />
    <router-view/>
    <Footer/>
  </div>

</template>
<script>
import NavHeader from "@/NavHeader.vue"
import Footer from "@/Footer.vue"
export default {
  components: {
    NavHeader,
    Footer
  },
  mounted(){
    this.$store.commit("setUrls");
    this.$store.dispatch("getProducts");
  }
}
</script>


