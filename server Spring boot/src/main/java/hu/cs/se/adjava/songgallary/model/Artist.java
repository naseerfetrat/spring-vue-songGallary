package hu.cs.se.adjava.songgallary.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "artist")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer","handler"})
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
 private Integer _id;
 private String fullName;
 private String genre;
 private int numOfSong;
 private String favoriteSong;

 public Artist() {
 }

 public Integer get_id() {
     return _id;
 }

 public void set_id(Integer _id) {
     this._id = _id;
 }

 public String getFullName() {
     return fullName;
 }

 public void setFullName(String fullName) {
     this.fullName = fullName;
 }

 public String getGenre() {
     return genre;
 }

 public void setGenre(String genre) {
     this.genre = genre;
 }

 public int getNumOfSong() {
     return numOfSong;
 }

 public void setNumOfSong(int numOfSong) {
     this.numOfSong = numOfSong;
 }

 public String getFavoriteSong() {
     return favoriteSong;
 }

 public void setFavoriteSong(String favoriteSong) {
     this.favoriteSong = favoriteSong;
 }

 public Artist(Integer _id, String fullName, String genre, int numOfSong, String favoriteSong) {
     this._id = _id;
     this.fullName = fullName;
     this.genre = genre;
     this.numOfSong = numOfSong;
     this.favoriteSong = favoriteSong;
 }


}
