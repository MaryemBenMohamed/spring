package tn.esprit.springproject.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.Departement;
import tn.esprit.springproject.entities.Universite;
import tn.esprit.springproject.repository.DepartementRepository;
import tn.esprit.springproject.repository.UniversiteRepository;

import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
//3awedhna beha@Autowired
public class DepartementServiceImpl implements IDepartementService{

    //Autowired
    DepartementRepository departementRepository;
    UniversiteRepository universiteRepository;
    @Override
    public Departement ajoutDepartement(Departement departement) {
        return departementRepository.save(departement);
    }

    @Override
    public Departement updateDepartement(Departement departement) {
        return departementRepository.save(departement);
    }

    @Override
    public List<Departement> retrieveAllDepartement() {
        return departementRepository.findAll();
    }

    @Override
    public void deleteDepartement(int id) {
        departementRepository.deleteById(id);
    }

    @Override
    public Departement retrieveDepartement(int id) {
        return departementRepository.findById(id).orElse(null);
    }

    @Override
    public Set<Departement> retrieveDepartementsByUniversite(Integer idUniversite) {
            Universite universite = universiteRepository.findById(idUniversite).orElse(null);
            return universite.getDepartements();

    }


}
