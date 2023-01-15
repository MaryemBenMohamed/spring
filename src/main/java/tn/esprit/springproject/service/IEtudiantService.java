package tn.esprit.springproject.service;

import tn.esprit.springproject.entities.Equipe;
import tn.esprit.springproject.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {

    Etudiant ajoutEtudiant(Etudiant etudiant);
    Etudiant updateEtudiant(Etudiant etudiant);
    List<Etudiant> retrieveAllEtudiant ();
    void deleteEtudiant(int id);
    Etudiant retrieveEtudiant (int id);
    void assignEtudiantToDepartement (Integer etudiantId,Integer departementId);

    Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe);
    List<Etudiant> getEtudiantsByDepartement (Integer idDepartement);

}
