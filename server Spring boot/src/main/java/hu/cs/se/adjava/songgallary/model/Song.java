package hu.cs.se.adjava.songgallary.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name ="songs")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer","handler"})
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer _id;
    private String title;
    private String artist;
    private String genre;
    private String album;
    private String youtubeId;
    private String lyrics;
    private String tab;

    public Song() {
    }
    public Song(Integer id, String title, String artist, String genre, String album, String youtubeId, String lyrics,
            String tab) {
        this._id = id;
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.album = album;
        this.youtubeId = youtubeId;
        this.lyrics = lyrics;
        this.tab = tab;
    }

    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getYoutubeId() {
        return youtubeId;
    }

    public void setYoutubeId(String youtubeId) {
        this.youtubeId = youtubeId;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public String getTab() {
        return tab;
    }

    public void setTab(String tab) {
        this.tab = tab;
    }

    public Integer get_id() {
        return _id;
    }

    public void set_id(Integer _id) {
        this._id = _id;
    }
    

    

}
