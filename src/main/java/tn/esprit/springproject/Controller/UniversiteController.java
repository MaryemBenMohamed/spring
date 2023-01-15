package tn.esprit.springproject.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.Universite;
import tn.esprit.springproject.service.IUniversiteService;
import tn.esprit.springproject.service.UniversiteServiceImpl;

import java.util.List;
@RestController
@AllArgsConstructor
public class UniversiteController {
    IUniversiteService universiteService;
    @PostMapping("/addUniversite")
    Universite ajoutUniversite(@RequestBody Universite universite){
        return universiteService.ajoutUniversite(universite);
    }
    @PutMapping("/updateUniversite")
    Universite updateUniversite(@RequestBody Universite universite){
        return universiteService.updateUniversite(universite);
    }
    @GetMapping("/findAllUniversite")
    List<Universite> retrieveAllUniversite (){
        return universiteService.retrieveAllUniversite();
    }
    @DeleteMapping("/removeUniversite/{id}")
    void deleteUniversite(@PathVariable int id){
        universiteService.deleteUniversite(id);
    }
    @GetMapping("/findUniversite/{id}")
    Universite retrieveUniversite(@PathVariable int id){
        return universiteService.retrieveUniversite(id);
    }

    @PostMapping("assignUniversiteToDepartement/{idUniversite}/{idDepartement}")
    public void assignUniversiteToDepartement(@PathVariable Integer idUniversite,@PathVariable Integer idDepartement){

        universiteService.assignUniversiteToDepartement(idUniversite,idDepartement);

    }

    @PostMapping("/addOrUpdate")
    public Universite addOrUpdateUniversite(Universite u){
        return universiteService.addOrUpdateUniversite(u);
    }
}
