package tn.esprit.springproject.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.springproject.entities.DetailEquipe;
import tn.esprit.springproject.service.IDetailEquipeService;

import java.util.List;

@RestController
@AllArgsConstructor
public class DetailEquipeController {
    IDetailEquipeService detailEquipeService;
    @GetMapping("/findAllDetail")
    List<DetailEquipe> retrieveAllDetailEquipe (){
        return detailEquipeService.retrieveAllDetailEquipe();
    }
    @GetMapping("/findDetail/{id}")
    DetailEquipe retrieveDetailEquipe(@PathVariable ("id") int id){
        return detailEquipeService.retrieveDetailEquipe(id);
    }
}
