package initiativep.controller;

import initiativep.dto.ProjetDto;
import initiativep.dto.UserDto;
import initiativep.model.Projet;
import initiativep.model.User;
import initiativep.services.ProjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

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
    private final ProjetService projetService;
    @PostMapping
    public ResponseEntity<Projet> createProjet(@RequestBody ProjetDto projetDTO) {
        Projet projet = projetService.creationProjet(projetDTO.getId(), projetDTO.getName());
        return new ResponseEntity<>(projet, HttpStatus.CREATED);
    }
    public AuthController(UserService userService, ProjetService projetService){
        this.userService = userService;
        this.projetService = projetService;
    }
}