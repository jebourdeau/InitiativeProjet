package initiativep.controller;

import initiativep.dto.ProjetDto;
import initiativep.model.Projet;
import initiativep.services.ProjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projet")
public class ProjetController {
    @Autowired
    private ProjetService projetService;

    @GetMapping
    public List<ProjetDto>getAllProjets(){
        return projetService.getAllProjets();
    }
    @GetMapping("/{id}")
    public ProjetDto getProjetById(@PathVariable Long id){
        return projetService.getProjetById(id);
    }
    @PostMapping
    public ProjetDto createProjet(@RequestBody ProjetDto projetDto){
        return projetService.createProjet(projetDto);
    }
    @DeleteMapping("/{id}")
    public void deleteProjet(@PathVariable Long id){
        projetService.deleteProjet(id);
    }

//    @PostMapping
//    public ResponseEntity<Projet> creationProjet(@PathVariable Long id, @RequestBody  String monProjet){
//        Projet projet = projetService.creationProjet(id, monProjet);
//   return new ResponseEntity<>(projet, HttpStatus.CREATED);
//    };
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void>deleteProjet(@PathVariable Long id){
//        projetService.deleteProjet(id);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
//    @PatchMapping("/{id}")
//    public ResponseEntity<Projet> updateProjet(@PathVariable Long id, @RequestBody ProjetDto projetDto){
//        Projet updateProjet= projetService.updateProjet(id, projetDto);
//        return  new ResponseEntity<>(updateProjet, HttpStatus.OK);
//    }
}
