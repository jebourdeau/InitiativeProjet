package initiativep.controller;

import initiativep.services.ProjetService;
import org.springframework.stereotype.Controller;

import initiativep.services.ParrainService;
import initiativep.services.UserService;


@Controller
public class AuthController {

    private final UserService userService;
    private final ParrainService parrainService;
    private final ProjetService projetService;

    public AuthController(UserService userService, ParrainService parrainService, ProjetService projetService){
        this.userService = userService;
        this.parrainService = parrainService;
        this.projetService = projetService;
    }
}