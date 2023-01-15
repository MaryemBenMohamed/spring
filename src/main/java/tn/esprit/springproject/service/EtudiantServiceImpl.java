package tn.esprit.springproject.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.Contrat;
import tn.esprit.springproject.entities.Departement;
import tn.esprit.springproject.entities.Equipe;
import tn.esprit.springproject.entities.Etudiant;
import tn.esprit.springproject.repository.ContratRepository;
import tn.esprit.springproject.repository.DepartementRepository;
import tn.esprit.springproject.repository.EquipeRepository;
import tn.esprit.springproject.repository.EtudiantRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Set;


@Service
@AllArgsConstructor
public class EtudiantServiceImpl implements IEtudiantService{

    EtudiantRepository etudiantRepository;
    DepartementRepository departementRepository;

    ContratRepository contratRepository;

    EquipeRepository equipeRepository;
    @Override
    public Etudiant ajoutEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public List<Etudiant> retrieveAllEtudiant() {
        return etudiantRepository.findAll();
    }

    @Override
    public void deleteEtudiant(int id) {
        etudiantRepository.deleteById(id);
    }

    @Override
    public Etudiant retrieveEtudiant(int id) {
        return etudiantRepository.findById(id).orElse(null);
    }



    @Override
    public void assignEtudiantToDepartement (Integer etudiantId,Integer departementId) {
        Etudiant e = etudiantRepository.findById(etudiantId).orElse(null);
        Departement dep = departementRepository.findById(departementId).orElse(null);
        e.setDepartement(dep);
        etudiantRepository.save(e);

    }

    @Transactional
    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe){
        Contrat c = contratRepository.findById(idContrat).orElse(null);
        Equipe eq = equipeRepository.findById(idEquipe).orElse(null);
        c.setEtudiant(e);
        e.getEquipes().add(eq);
        return etudiantRepository.save(e);

    }

    @Override
    public List<Etudiant> getEtudiantsByDepartement(Integer idDepartement) {
        return etudiantRepository.findByDepartementIdDepart(idDepartement);
    }


}
