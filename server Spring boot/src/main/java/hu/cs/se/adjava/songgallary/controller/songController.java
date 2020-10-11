package hu.cs.se.adjava.songgallary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import hu.cs.se.adjava.songgallary.model.Song;
import hu.cs.se.adjava.songgallary.services.songService;

@RestController
@CrossOrigin(origins = "*")
public class songController {
    
    @Autowired
    private songService songservice;

    @GetMapping(path = "/songs")
    public ResponseEntity<List<Song>> getSongs(){
        List<Song> songs = songservice.getAllSongs();
        return new ResponseEntity<>(songs , HttpStatus.OK);
    }

    @PostMapping(path = "/songs")
    public ResponseEntity<Song> addSong(@RequestBody Song song){
        Song SavedSong = songservice.addSong(song);
        return new ResponseEntity<>(SavedSong , HttpStatus.CREATED);
    }
    @GetMapping(path = "/songs/{id}")
    public ResponseEntity<Song> getSong(@PathVariable Integer id){
        Song song = songservice.getSongById(id);
        return new ResponseEntity<>(song , HttpStatus.OK);
    }
    
    @PutMapping(path = "/songs/{songId}")
    public ResponseEntity<Song> updateSong(@RequestBody Song song){

        Song SavedSong = songservice.addSong(song);
        return new ResponseEntity<>(SavedSong , HttpStatus.OK);
    }

    @DeleteMapping(path = "/songs/{songId}")
    public ResponseEntity<String> deleteSong(@PathVariable("songId") Integer _id){
        songservice.deleteSongById(_id);
        return new ResponseEntity<>("Song "+_id+" deleted succesfully",HttpStatus.OK);
    }

}
