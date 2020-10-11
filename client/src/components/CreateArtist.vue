<template>
  <div class="center col-sm-5 mr-auto ml-auto p-0">
    <panel title="Artist Meta Data">
      <div class="container">
        <form v-on:submit.prevent="register">
          <div>
            <div class="row break">
              <div class="col-sm-3 m-auto">
                <label for="fullname">Full Name</label>
              </div>
              <div class="col-sm-12">
                <input
                  class="form-control"
                  placeholder="Enter FullName of the Artist"
                  v-model="fullName"
                />
                <div class="invalid-feedback">Required.</div>
              </div>
            </div>
            <div class="row break">
              <div class="col-sm-3 m-auto">
                <label for="genre">Genre</label>
              </div>
              <div class="col-sm-12">
                <input
                  class="form-control"
                  placeholder="Enter Genre's of the Artist"
                  v-model="genre"
                />
                <div class="invalid-feedback">Required.</div>
              </div>
            </div>
            <div class="row break">
              <div class="col-sm-4 m-auto">
                <label for="numOfSong">Number Of Song</label>
              </div>
              <div class="col-sm-12">
                <input
                  class="form-control"
                  placeholder="Enter Number of Song of the Artist"
                  v-model="numOfSong"
                />
                <div class="invalid-feedback">Required.</div>
              </div>
            </div>
            <div class="row break">
              <div class="col-sm-3 m-auto">
                <label for="favoritesong">Favorite Song</label>
              </div>
              <div class="col-sm-12">
                <input
                  class="form-control"
                  placeholder="Enter Favorite song of the Artist"
                  v-model="favoriteSong"
                />
                <div class="invalid-feedback">Required.</div>
              </div>
            </div>
          </div>
         <button class="btn btn-sm btn-success" type="submit">ADD</button>
        </form>
        <div class="error" v-html="error" />
      </div>
    </panel>
  </div>

<!-- <v-layout column>
    <v-flex xs6 offset-xs3>
      <panel title="Register">
        <form
          name="tab-tracker-form"
          autocomplete="off">
          <v-text-field
            label="Email"
            v-model="email"
          ></v-text-field>
          <br>
          <v-text-field
            label="Password"
            type="password"
            v-model="password"
            autocomplete="new-password"
          ></v-text-field>
        </form>
        <br>
        <div class="danger-alert" v-html="error" />
        <br>
        <v-btn
          dark
          class="cyan"
          @click="register">
          Register
        </v-btn>
      </panel>
    </v-flex>
  </v-layout> -->

</template>

<script>
// eslint-disable-next-line
/* eslint-disable */
import ArtistService from "@/services/ArtistService";
export default {
  data() {
    return {
      fullName: "",
      genre: "",
      numOfSong: null,
      favoriteSong:null,
      error:""
    };
  },
  methods: {
    async register() {
      try {
        const response = await ArtistService.createArtist({
          fullName: this.fullName,
          genre: this.genre,
          numOfSong: this.numOfSong,
          favoriteSong:this.favoriteSong
        });
        // this.$store.dispatch("setToken", response.data.token);
        // this.$store.dispatch("setUser", response.data.user);
        this.$router.push({
          name: "artist",
        });
        console.log(response.data);
      } catch (error) {
        this.error = error.response.data.error;
      }
    },
  },
};
</script>

<style scoped>
.container {
  align-items: center;
}
.error {
  color: red;
}
.btn {
  width: 25%;
  text-align: center;
  margin-top: 15px;
  font-size: 20px;
}
.col {
  border-radius: 10px;
  height: 400px;
  width: 300px;
  text-align: center;
  align-items: center;
  align-content: center;
}
.center {
  box-shadow: 0 0 10px #474744;
}
</style>
