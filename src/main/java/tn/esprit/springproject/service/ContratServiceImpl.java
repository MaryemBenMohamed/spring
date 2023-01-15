package tn.esprit.springproject.service;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.Contrat;
import tn.esprit.springproject.entities.Etudiant;
import tn.esprit.springproject.repository.ContratRepository;
import tn.esprit.springproject.repository.EtudiantRepository;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class ContratServiceImpl implements IContratService{

    ContratRepository contratRepository;
    EtudiantRepository etudiantRepository;

    @Override
    public Contrat ajoutContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public Contrat updateContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public List<Contrat> retrieveAllContrat() {
        return contratRepository.findAll();
    }

    @Override
    public void deleteContrat(int id) {
        contratRepository.deleteById(id);

    }

    @Override
    public Contrat retrieveContrat(int id) {
        return contratRepository.findById(id).orElse(null);
    }

    @Override
    public Contrat affectContratToEtudiant(Contrat ce, String nomE, String prenomE) {
            Contrat c = contratRepository.findById((ce.getIdContrat())).orElse(null);
            Etudiant etudiant = etudiantRepository.findByNomEAndPrenomE(nomE,prenomE);
            if (contratRepository.countByEtudiantIdEtudiantAndArchive(etudiant.getIdEtudiant(), false)<5)
                c.setEtudiant(etudiant);
            return contratRepository.save(c);
    }

    @Override
    public Integer nbContratsValides(Date startDate, Date endDate) {
        //return contratRepository.findByArchiveAndDateFinContratBetween(false,startDate,endDate).size();
        return contratRepository.countByArchiveAndDateFinContratBetween(false,startDate,endDate);
    }


}
