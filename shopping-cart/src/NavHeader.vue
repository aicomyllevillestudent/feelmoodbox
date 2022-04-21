<template>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark" role="navigation">
  <div class="container">
    <ul class="nav navbar-nav">
      <div class="d-flex">
      <li style="max-width: 25%">
        <a class="navbar brand" href="/"><img class="w-100" src="https://cdn.discordapp.com/attachments/959377579566043206/965968001415381023/Feelmoodbox.png"></a>
      </li>
        <div class="pt-3 d-flex">
        <li>
          <a class="navbar brand text-light " href="/">Home</a>
        </li>
        <li>
        <a class="navbar brand text-light " href="/shop">Shop</a>
        </li>
          <div class="d-flex" style="margin-left: 500px">
        <li>
          <ShoppingCart/>
        </li>
        <router-link to="/" tag="li" v-if="!isAuthenticated" class="" active-class="active">
          <a @click="onLoginClicked" class="navbar brand text-light">Login</a>
        </router-link>
        </div>
        </div>

        <li v-if="isAuthenticated" class="navbar brand">
          <div class="dropdown">
            <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
              {{ getUserName() }}
            </button>
            <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
              <a class="dropdown-item" href="#">Account Settings</a>
              <a @click="onLogoutClicked" class="dropdown-item">Logout {{ userEmail }}</a>
            </div>

          </div>
        </li>
</div>
      </ul>
  </div>
</nav>
  </template>

<script>
import ShoppingCart from './ShoppingCart.vue';
export default {
  components: { ShoppingCart },
  name: 'NavHeader',
  computed: {
    userEmail() {
      return this.isLoggedIn ? this.currentUser.email : ''
    },
    isAuthenticated() {
      return this.$store.state.user.isAuthenticated;
    },
  },
  methods: {
    onLoginClicked() {
      window.location = this.$store.state.endpoints.login;
    },
    onLogoutClicked() {
      this.$store.commit("logout");
    },
    getUserName() {
      return this.$store.state.user.name;
    }
  }
}
</script>