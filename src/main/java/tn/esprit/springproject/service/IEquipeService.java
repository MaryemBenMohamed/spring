package tn.esprit.springproject.service;

import tn.esprit.springproject.entities.Contrat;
import tn.esprit.springproject.entities.Equipe;

import java.util.List;

public interface IEquipeService {

    Equipe ajoutEquipe(Equipe equipe);
    Equipe updateEquipe(Equipe equipe);
    List<Equipe> retrieveAllEquipe ();
    void deleteEquipe(int id);
    Equipe retrieveEquipe (int id);
}
