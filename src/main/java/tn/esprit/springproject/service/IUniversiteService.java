package tn.esprit.springproject.service;

import tn.esprit.springproject.entities.Etudiant;
import tn.esprit.springproject.entities.Universite;

import java.util.List;

public interface IUniversiteService {

    Universite ajoutUniversite(Universite universite);
    Universite updateUniversite(Universite universite);
    List<Universite> retrieveAllUniversite ();
    void deleteUniversite(int id);
    Universite retrieveUniversite(int id);
    void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement);
    Universite addOrUpdateUniversite(Universite u);

    }
