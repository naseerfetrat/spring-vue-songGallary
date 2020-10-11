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
import hu.cs.se.adjava.songgallary.model.Artist;

import hu.cs.se.adjava.songgallary.services.artistService;

@RestController
@CrossOrigin(origins = "*")
public class artistController {
   
    @Autowired
    private artistService artistservice;

    @GetMapping("/artist")
    public ResponseEntity<List<Artist>> getArtists(){
        List<Artist> Artists  = artistservice.getAllArtists();
        return new ResponseEntity<>(Artists , HttpStatus.OK);
    }

    @GetMapping("/artist/{id}")
    public ResponseEntity<Artist>getArtist(@PathVariable Integer id){
        Artist Artist = artistservice.getArtistById(id);
        return new ResponseEntity<>(Artist , HttpStatus.OK);
    }

    @PostMapping("/artist")
    public ResponseEntity<Artist> addArtist(@RequestBody Artist artist){
        Artist savedArtist = artistservice.addArtist(artist);
        return new ResponseEntity<>(savedArtist , HttpStatus.CREATED);

    }

  

    @PutMapping("/artist/{artistId}")
    public ResponseEntity<Artist> updateArtist(@RequestBody Artist Artist){
        Artist savedArtist = artistservice.addArtist(Artist);
        return new ResponseEntity<>(savedArtist , HttpStatus.OK);
        
    }


    
    @DeleteMapping("/artist/{id}")
    public ResponseEntity<String> deleteArtist(@PathVariable Integer id){
        artistservice.deleteArtistById(id);
        return new ResponseEntity<>("Artist "+id+" deleted succesfully",HttpStatus.OK);
    }
    
}
