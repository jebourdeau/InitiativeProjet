package initiativep.controller;

import initiativep.dto.ProjetDto;
import initiativep.model.Projet;
import initiativep.services.ProjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import initiativep.services.ParrainService;
import initiativep.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RestController
public class AuthController {
    @Autowired
    private final UserService userService;
    @Autowired
    private final ParrainService parrainService;
    @Autowired
    private final ProjetService projetService;



    @PostMapping
    public ResponseEntity<Projet> createProjet(@RequestBody ProjetDto projetDTO) {
        Projet projet = projetService.creationProjet(projetDTO.getIdUser(), projetDTO.getNomProjet(), projetDTO.getMembres());
        return new ResponseEntity<>(projet, HttpStatus.CREATED);
    }
    public AuthController(UserService userService, ParrainService parrainService, ProjetService projetService){
        this.userService = userService;
        this.parrainService = parrainService;
        this.projetService = projetService;
    }
}