package tn.esprit.springproject.service;

import tn.esprit.springproject.entities.DetailEquipe;

import java.util.List;

public interface IDetailEquipeService {

    List<DetailEquipe> retrieveAllDetailEquipe ();
    DetailEquipe retrieveDetailEquipe(int id);
}
