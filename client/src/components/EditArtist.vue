<template>
  <div class="center col-sm-5 mr-auto ml-auto p-0">
    <panel title="Artist Meta Data">
      <div class="container">
        <form v-on:submit.prevent="save">
          <div>
            <div class="row break">
              <div class="col-sm-3 m-auto">
                <label for="fullname">Full Name</label>
              </div>
              <div class="col-sm-12">
                <input
                  class="form-control"
                  placeholder="Enter FullName of the Artist"
                  v-model="artist.fullName"
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
                  v-model="artist.genre"
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
                  v-model="artist.numOfSong"
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
                  v-model="artist.favoriteSong"
                />
                <div class="invalid-feedback">Required.</div>
              </div>
            </div>
          </div>
         <button class="btn btn-sm btn-success" type="submit">Update</button>
        </form>
        <div class="error" v-html="error" />
      </div>
    </panel>
  </div>
</template>

<script>
// eslint-disable-next-line
/* eslint-disable */
import ArtistService from "@/services/ArtistService";
export default {
  data() {
    return {
      artist: {
        fullName: null,
        genre: null,
        numOfSong: null,
        favoriteSong: null,
      },
      error: null,
      validValud: "",
      required: (value) => !!value || "Required.",
    };
  },
  methods: {
    async save() {
      this.error = null;
      const artistId = this.$store.state.route.params.artistId;
      try {
        await ArtistService.put(this.artist);
        this.$router.push({
          name: "artist",
        });
      } catch (error) {
        console.log(error);
      }
    },
  
  },
  async mounted() {
    const artistId = this.$store.state.route.params.artistId;
    this.artist = (await ArtistService.show(artistId)).data;
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
