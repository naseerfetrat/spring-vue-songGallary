package hu.cs.se.adjava.songgallary.services;

import java.util.List;

import hu.cs.se.adjava.songgallary.model.Artist;

public interface artistService {
    Artist  addArtist(Artist artist);
    
    List<Artist> getAllArtists();

    Artist getArtistById(Integer id);

    void deleteArtistById(Integer id);
    
}
