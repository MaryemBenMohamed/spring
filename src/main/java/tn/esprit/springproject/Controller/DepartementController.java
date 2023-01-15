package tn.esprit.springproject.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.Departement;
import tn.esprit.springproject.service.IDepartementService;

import java.util.List;
import java.util.Set;

@RestController
@AllArgsConstructor
public class DepartementController {

    IDepartementService departementService;
    @PostMapping("/addDepartement")
    Departement ajoutDepartement(@RequestBody Departement departement){
        return departementService.ajoutDepartement(departement);
    }
    @PutMapping("updateDepartement")
    Departement updateDepartement(@RequestBody Departement departement){
        return departementService.updateDepartement(departement);
    }
    @GetMapping("findAllDepartement")
    List<Departement> retrieveAllDepartement (){
        return departementService.retrieveAllDepartement();
    }
    @DeleteMapping("removeDepartement/{id}")
    void deleteDepartement(@PathVariable int id){
        departementService.deleteDepartement(id);
    }
    @GetMapping("findDepartement/{id}")
    Departement retrieveDepartement(@PathVariable int id){
        return departementService.retrieveDepartement(id);
    }
    @GetMapping("/retrieveDepartementsByUniversite/{idUniversite}")
    Set<Departement> retrieveDepartementsByUniversite(@PathVariable Integer idUniversite) {
        return departementService.retrieveDepartementsByUniversite(idUniversite);
    }


}
