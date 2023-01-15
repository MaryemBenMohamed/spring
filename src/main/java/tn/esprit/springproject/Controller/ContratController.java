package tn.esprit.springproject.Controller;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.Contrat;
import tn.esprit.springproject.service.IContratService;

import java.util.Date;
import java.util.List;


@RestController
@AllArgsConstructor
public class ContratController {

    IContratService contratService;

    @PostMapping("/add")
    Contrat ajoutContrat(@RequestBody Contrat contrat) {
        return contratService.ajoutContrat(contrat);

    }

    @PutMapping("/update")
    Contrat updateContrat(@RequestBody Contrat contrat) {
        return contratService.updateContrat(contrat);
    }

    @GetMapping("/all")
    List<Contrat> retrieveAllContrat() {
        return contratService.retrieveAllContrat();
    }

    @DeleteMapping("/delete/{id}")
    void deleteContrat(@PathVariable ("id") int id) {
        contratService.deleteContrat(id);
    }

    @GetMapping("/get/{id}")
    Contrat retrieveContrat(@PathVariable ("id") int id) {
        return contratService.retrieveContrat(id);
    }

    @PostMapping("/affectContratToEtudiant/{nomE}/{prenomE}")
    Contrat affectContratToEtudiant(@RequestBody Contrat ce, @PathVariable String nomE, @PathVariable String prenomE) {
        return contratService.affectContratToEtudiant(ce, nomE, prenomE);
    }

    @GetMapping("/nbContratsValides/{d1}/{d2}")
    public Integer nbContratsValides(@PathVariable ("d1") @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate, @PathVariable ("d2") @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate) {
    return contratService.nbContratsValides(startDate,endDate);
    }
}
