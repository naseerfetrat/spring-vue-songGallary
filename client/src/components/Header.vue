<template>
  <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
    <div class="container">
      <router-link class="navbar-brand" to="/">Song Gallary</router-link>

      <!-- TODO:implement me -->
      <form class="form-inline mr-auto">
        <button class="btn btn-default">
          <router-link to="/songs" class="text-white">BROWSE</router-link>
        </button>
      </form>
      <ul class="navbar-nav">
        <li class="navbar-item">
          <router-link class="nav-link" to="/artist">Artists</router-link>
        </li>
        <li class="navbar-item">
          <router-link class="nav-link" to="/artist/create">NewArtist</router-link>
        </li>
      </ul>
    </div>
  </nav>
</template>
<script>
// eslint-disable-next-line
/* eslint-disable */
export default {
  data() {
    return {
    };
  },
  methods: {
    navigateTo(route) {
      this.$router.push(route);
    },
  },
  async mounted(){
  }
};
</script>
<style scoped>
nav {
  margin-bottom: 50px;
  padding-left: 0;
}
a:hover {
  text-decoration: none;
}
span{
  cursor: pointer;
}
</style>>