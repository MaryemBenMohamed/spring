package tn.esprit.springproject.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.DetailEquipe;
import tn.esprit.springproject.entities.Equipe;
import tn.esprit.springproject.service.IEquipeService;

import java.util.List;


@RestController
@AllArgsConstructor
public class EquipeController {

    IEquipeService equipeService;
    @PostMapping("equipe")
    Equipe ajoutEquipe(@RequestBody Equipe equipe){
        return equipeService.ajoutEquipe(equipe);
    }
    @PutMapping("equipe")
    Equipe updateEquipe(@RequestBody Equipe equipe){
        return equipeService.updateEquipe(equipe);
    }
    @GetMapping("equipe")
    List<Equipe> retrieveAllEquipe (){
        return equipeService.retrieveAllEquipe();
    }
    @DeleteMapping("equipe/{idE}")
    void deleteEquipe(@PathVariable("idE") int id){
        equipeService.deleteEquipe(id);
    }
    @GetMapping("equipe/{id}")
    Equipe retrieveEquipe (@PathVariable int id){
        return equipeService.retrieveEquipe(id);
    }
    @PostMapping("/addEquipe")
    Equipe addEquipe(@RequestBody Equipe e){
        return equipeService.ajoutEquipe(e);
    }
}
