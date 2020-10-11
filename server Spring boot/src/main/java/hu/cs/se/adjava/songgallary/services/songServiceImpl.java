package hu.cs.se.adjava.songgallary.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.cs.se.adjava.songgallary.model.Song;
import hu.cs.se.adjava.songgallary.repository.songRepository;
@Service
public class songServiceImpl implements songService {

    @Autowired
    private songRepository songrepository;

    @Override
    public Song addSong(Song song) {
        return songrepository.save(song);
    }

    @Override
    public List<Song> getAllSongs() {
        return songrepository.findAll();
    }

    @Override
    public Song getSongById(Integer _id) {

        return songrepository.getOne(_id);
    }

    @Override
    public void deleteSongById(Integer id) {
        songrepository.deleteById(id);
    }
    
}
