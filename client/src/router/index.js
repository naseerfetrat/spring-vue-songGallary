// eslint-disable-next-line
/* eslint-disable */
import Vue from "vue";
import Router from "vue-router";
import CreateArtist from "@/components/CreateArtist";
import Artist from "@/components/Artist";
import Songs from "@/components/Songs/index";
import CreateSong from "@/components/CreateSong";
import ViewSong from "@/components/ViewSong/index";
import EditSong from "@/components/EditSong";
import EditArtist from "@/components/EditArtist";
import ViewArtist from "@/components/ViewArtist";

Vue.use(Router);

export default new Router({
  mode:'history',
  hash:'false',
  routes: [
    {
      path: "/artist/create",
      name: "artist-create",
      component: CreateArtist
    },
    {
      path: "/artist",
      name: "artist",
      component: Artist
    },
    {
      path: "/songs",
      name: "songs",
      component: Songs
    },
    {
      path: "/songs/create",
      name: "songs-create",
      component: CreateSong
    },
    {
      path: "/songs/:songId",
      name: "song",
      component: ViewSong
    },
    {
      path: "/songs/:songId/edit",
      name: "song-edit",
      component: EditSong
    },
    {
      path: "/artist/:artistId/edit",
      name: "artist-edit",
      component: EditArtist
    },
    {
      path: "/artist/:artistId",
      name: "artistt",
      component: ViewArtist
    },
    {
      path: "*",
      redirect: "songs"
    }
  ]
});
