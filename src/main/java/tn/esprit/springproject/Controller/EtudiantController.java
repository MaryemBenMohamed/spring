package tn.esprit.springproject.Controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.Etudiant;
import tn.esprit.springproject.service.EtudiantServiceImpl;
import tn.esprit.springproject.service.IEtudiantService;

import java.util.List;

@RestController
@AllArgsConstructor
public class EtudiantController {

    IEtudiantService etudiantService;
    @PostMapping("addEtudiant")
    Etudiant ajoutEtudiant(@RequestBody Etudiant etudiant){
        return etudiantService.ajoutEtudiant(etudiant);
    }
    @PutMapping("updateEtudiant")
    Etudiant updateEtudiant(@RequestBody Etudiant etudiant){
        return etudiantService.updateEtudiant(etudiant);
    }
    @GetMapping("findAllEtudiant")
    List<Etudiant> retrieveAllEtudiant (){
        return etudiantService.retrieveAllEtudiant();
    }
    @DeleteMapping("removeEtudiant/{id}")
    void deleteEtudiant(@PathVariable int id){
        etudiantService.deleteEtudiant(id);
    }
    @GetMapping("finEtudiant/{id}")
    Etudiant retrieveEtudiant (@PathVariable int id){
        return etudiantService.retrieveEtudiant(id);
    }
    @PostMapping("/assignetudianttodepartement/{etudiantId}/{departementId}")
     void assignEtudiantToDepartement (@PathVariable Integer etudiantId,@PathVariable Integer departementId){
        etudiantService.assignEtudiantToDepartement(etudiantId,departementId);
    }
    @PostMapping("/addAndAssignEtudiantToEquipeAndContract/{idContrat}/{idEquipe}")
    Etudiant addAndAssignEtudiantToEquipeAndContract(@RequestBody Etudiant e,@PathVariable Integer idContrat,@PathVariable  Integer idEquipe)
    {
        return etudiantService.addAndAssignEtudiantToEquipeAndContract(e,idContrat,idEquipe);
    }
    @GetMapping("/getEtudiantsByDepartement/{idDep}")
    List<Etudiant> getEtudiantsByDepartement (@PathVariable ("idDep") Integer idDepartement){
        return etudiantService.getEtudiantsByDepartement(idDepartement);

    }

    }
