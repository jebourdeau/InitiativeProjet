package initiativep.controller;

import org.springframework.stereotype.Controller;

import initiativep.services.ParrainService;
import initiativep.services.UserService;


@Controller
public class AuthController {

    private final UserService userService;
    private final ParrainService parrainService;

    public AuthController(UserService userService, ParrainService parrainService){
        this.userService = userService;
        this.parrainService = parrainService;
    }
}