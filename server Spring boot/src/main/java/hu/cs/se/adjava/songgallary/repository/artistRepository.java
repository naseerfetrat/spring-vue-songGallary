package hu.cs.se.adjava.songgallary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hu.cs.se.adjava.songgallary.model.Artist;

@Repository
public interface artistRepository extends JpaRepository<Artist , Integer>{
	
    
}
