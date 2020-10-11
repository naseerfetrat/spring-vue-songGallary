<template>
  <div class="center col-sm-5 m-auto p-0">
    <panel title="Artists">
    <div v-for="artist in artists" :key="artist.id" class="song">
      <div class="row">
        <div class="col-sm-6">
          <div class="artist-name">Name: {{ artist.fullName }}</div>
          <div class="artist-genre">genre: {{ artist.genre }}</div>
          <div class="artist-song">Songs: {{ artist.numOfSong }}</div>
          <br>
        </div>
        <div class="col-sm-6">
          <button
            class="btn btn-primary btn-sm mt-4"
            @click="navigateTo({ name: 'artist-edit', params: { artistId: artist._id } })"
          >Edit</button>
          <button
            class="btn btn-danger btn-sm mt-4"
            @click="deleteArtist(artist._id)"
          >Delete</button>
          <div class="artist-favorite">Favorite song: {{ artist.favoriteSong }}</div>
        </div>
      </div>
    </div>
  </panel>
  </div>
</template>

<script>
// eslint-disable-next-line
/* eslint-disable */
// import AuthenticationService from "@/services/AuthenticationService";
import ArtistService from "@/services/ArtistService";


export default {
  data() {
    return {
      artists: null,
    };
  },

  async mounted() {
    //do a request to the backend for all artist
    this.artists = (await ArtistService.index()).data;
  },
  methods: {
    navigateTo(route) {
      this.$router.push(route);
    },
     async deleteArtist(id) {
      try {
        
        const conf = confirm("Are You Sure to Delete This Artist?")
        const res = await ArtistService.delete(id);
        this.$router.push({
          name:"artist-create"
        })
      } catch (err) {
        console.log(err);
      }
    },
  }
}
  
</script>

<style scoped>
.container {
  align-items: center;
}
.error {
  color: red;
}
.center {
  box-shadow: 0 0 10px #474744;
}
.artist-name {
  font-size: 32px;
  color:black;
}
.artist-favorite{
  font-size: 20px;
}
.artist-genre {
  font-size: 24px;
}
.artist-song {
  font-size: 16px;
}
</style>
