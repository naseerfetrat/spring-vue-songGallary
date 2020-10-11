package hu.cs.se.adjava.songgallary.services;

import java.util.List;

import hu.cs.se.adjava.songgallary.model.Song;

public interface songService {
    Song  addSong(Song song);
    
    List<Song> getAllSongs();

    Song getSongById(Integer id);

	void deleteSongById(Integer id);

}
