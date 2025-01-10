package initiativep.controller;

import initiativep.dto.ProjetDto;
import initiativep.model.Projet;
import initiativep.services.ProjetService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/projet")
public class ProjetController {
    private ProjetService projetService;

    @PostMapping
    public ResponseEntity<Projet> creationProjet(@PathVariable Long id, @RequestBody  String monProjet){
        Projet projet = projetService.creationProjet(id, monProjet);
   return new ResponseEntity<>(projet, HttpStatus.CREATED);
    };

    @DeleteMapping("/{id}")
    public ResponseEntity<Void>deleteProjet(@PathVariable Long id){
        projetService.deleteProjet(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @PatchMapping("/{id}")
    public ResponseEntity<Projet> updateProjet(@PathVariable Long id, @RequestBody ProjetDto projetDto){
        Projet updateProjet= projetService.updateProjet(id, projetDto);
        return  new ResponseEntity<>(updateProjet, HttpStatus.OK);
    }
}
