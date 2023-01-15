package tn.esprit.springproject.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.Departement;
import tn.esprit.springproject.entities.Universite;
import tn.esprit.springproject.repository.DepartementRepository;
import tn.esprit.springproject.repository.UniversiteRepository;

import java.util.List;


@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements IUniversiteService{
    UniversiteRepository universiteRepository;
    DepartementRepository departementRepository;
    @Override
    public Universite ajoutUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public Universite updateUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public List<Universite> retrieveAllUniversite() {
        return universiteRepository.findAll();
    }

    @Override
    public void deleteUniversite(int id) {
        universiteRepository.deleteById(id);
    }

    @Override
    public Universite retrieveUniversite(int id) {
        return universiteRepository.findById(id).orElse(null);
    }

    @Override
    public void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement) {
            Universite uni = universiteRepository.findById(idUniversite).orElse(null);
            Departement dep = departementRepository.findById(idDepartement).orElse(null);
            uni.getDepartements().add(dep);
            universiteRepository.save(uni);

    }

    @Override
    public Universite addOrUpdateUniversite(Universite u) {
        return universiteRepository.save(u);
    }


}
