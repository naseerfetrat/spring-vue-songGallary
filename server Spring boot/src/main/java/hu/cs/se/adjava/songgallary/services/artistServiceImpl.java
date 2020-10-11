package hu.cs.se.adjava.songgallary.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.cs.se.adjava.songgallary.model.Artist;
import hu.cs.se.adjava.songgallary.repository.artistRepository;

@Service
public class artistServiceImpl implements artistService {
    @Autowired
    private artistRepository artistrepository;

    @Override
    public Artist addArtist(Artist Artist) {
        return artistrepository.save(Artist);
    }

    @Override
    public List<Artist> getAllArtists() {
        return artistrepository.findAll();
    }

    @Override
    public Artist getArtistById(Integer id) {
        return artistrepository.getOne(id);
    }

    @Override
    public void deleteArtistById(Integer id) {
        artistrepository.deleteById(id);
    }
}
