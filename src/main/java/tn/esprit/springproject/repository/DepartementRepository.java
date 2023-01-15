package tn.esprit.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entities.Contrat;
import tn.esprit.springproject.entities.Departement;
import tn.esprit.springproject.entities.Etudiant;
import tn.esprit.springproject.entities.Universite;

import java.util.List;

public interface DepartementRepository extends JpaRepository<Departement,Integer> {
    //List<Departement> findByUniversite(Universite universite);
}
