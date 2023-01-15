package tn.esprit.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entities.DetailEquipe;
import tn.esprit.springproject.entities.Universite;

public interface UniversiteRepository extends JpaRepository<Universite,Integer> {
}
