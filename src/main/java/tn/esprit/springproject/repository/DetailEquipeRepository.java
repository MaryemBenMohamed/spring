package tn.esprit.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entities.Departement;
import tn.esprit.springproject.entities.DetailEquipe;

public interface DetailEquipeRepository extends JpaRepository<DetailEquipe,Integer> {
}
