// eslint-disable-next-line
/* eslint-disable */
import Api from "@/services/Api.js";

export default {
  index() {
    return Api().get("artist");
  },
  createArtist(data) {
    return Api().post("artist", data);
  },
  delete(artistId){
      return Api().delete(`artist/${artistId}`);
  },
  put(artist) {
    return Api().put(`artist/${artist.id}`, artist);
  },
  show(artistId) {
    return Api().get(`artist/${artistId}`);
  },
};
