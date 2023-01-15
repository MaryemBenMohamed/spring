package tn.esprit.springproject.service;

import tn.esprit.springproject.entities.Contrat;

import java.util.Date;
import java.util.List;

public interface IContratService {
        Contrat ajoutContrat(Contrat contrat);
        Contrat updateContrat(Contrat contrat);
        List<Contrat> retrieveAllContrat ();
        void deleteContrat(int id);
        Contrat retrieveContrat (int id);
        Contrat affectContratToEtudiant (Contrat ce,String nomE,String prenomE);
        Integer nbContratsValides(Date startDate, Date endDate);




}
