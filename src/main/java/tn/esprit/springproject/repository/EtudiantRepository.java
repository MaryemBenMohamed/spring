package tn.esprit.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.esprit.springproject.entities.Departement;
import tn.esprit.springproject.entities.DetailEquipe;
import tn.esprit.springproject.entities.Etudiant;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {
    //List<Etudiant> findByDep(Departement departement);

    //JPQL(des requettes sql orientés objet)

   //@Query("select e from Etudiant e where e.nomE=?1 and e.prenomE=?2")
    //sql:
   @Query(value = "select * from table_etudiant e where e.etudiant_nom=?1 and e.prenomE=?2", nativeQuery = true)
    Etudiant retrieveEtudiantNomPrenom(String nom, String prenom);

   //On utilise l key words
    Etudiant findByNomEAndPrenomE(String nom, String prenom);

    List<Etudiant> findByDepartementIdDepart(Integer idDepart);

}
