<template>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark" role="navigation">
  <div class="container">
    <a class="navbar brand" href="/"><img class="w-25" src="https://i.pinimg.com/originals/10/56/1d/10561d687459407da350a04da728034b.jpg"></a>


      <ul class="nav navbar-nav">
        <li>
        <a class="navbar brand text-light" href="/shop">Shop</a>
        </li>
        <li>
          <ShoppingCart />
        </li>
        <router-link to="/" tag="li" v-if="!isAuthenticated" class="nav-item" active-class="active">
          <a @click="onLoginClicked" class="nav-link pl-3">Login</a>
        </router-link>
        <li v-if="isAuthenticated" class="li-pointer nav-item">
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