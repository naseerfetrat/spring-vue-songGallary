package hu.cs.se.adjava.songgallary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hu.cs.se.adjava.songgallary.model.Song;

@Repository
public interface songRepository extends JpaRepository<Song , Integer>{
    
}
