package tn.esprit.springproject.service;

import tn.esprit.springproject.entities.Contrat;
import tn.esprit.springproject.entities.Departement;

import java.util.List;
import java.util.Set;

public interface IDepartementService {
    Departement ajoutDepartement(Departement departement);
    Departement updateDepartement(Departement departement);
    List<Departement> retrieveAllDepartement ();
    void deleteDepartement(int id);
    Departement retrieveDepartement(int id);
     Set<Departement> retrieveDepartementsByUniversite(Integer idUniversite);

    }
