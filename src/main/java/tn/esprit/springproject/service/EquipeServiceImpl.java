package tn.esprit.springproject.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.DetailEquipe;
import tn.esprit.springproject.entities.Equipe;
import tn.esprit.springproject.repository.EquipeRepository;

import java.util.List;


@Service
@AllArgsConstructor
public class EquipeServiceImpl implements IEquipeService{

    EquipeRepository equipeRepository;
    @Override
    public Equipe ajoutEquipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }

    @Override
    public Equipe updateEquipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }

    @Override
    public List<Equipe> retrieveAllEquipe() {
        return equipeRepository.findAll();
    }

    @Override
    public void deleteEquipe(int id) {
        equipeRepository.deleteById(id);

    }

    @Override
    public Equipe retrieveEquipe(int id) {
        return equipeRepository.findById(id).orElse(null);
    }
    Equipe addEquipe(Equipe e){
        DetailEquipe d = e.getDetailEquipe();
        d.setEquipe(e);
       return equipeRepository.save(e);
    }
}
