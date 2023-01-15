package tn.esprit.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entities.Contrat;

import java.util.Date;
import java.util.List;

public interface ContratRepository extends JpaRepository<Contrat,Integer> {
    /*List<Contrat> findByMontantContratGreaterThan(int montant);*/
    Integer countByEtudiantIdEtudiantAndArchive(Integer idEtudiant, Boolean archive);

    List<Contrat> findByArchiveAndDateFinContratBetween(boolean archive, Date startDate, Date endDate);

    Integer countByArchiveAndDateFinContratBetween(boolean archive, Date startDate, Date endDate);


}
