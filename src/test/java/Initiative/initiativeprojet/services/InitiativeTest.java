package Initiative.initiativeprojet.services;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import initiativep.repository.ParrainRepository;
import initiativep.repository.UserRepository;
import initiativep.services.UserService;


public class InitiativeTest {

    @Mock
    private UserRepository userRepository;
    @Mock
    private ParrainRepository parrainRepository;
    @InjectMocks
    private ProjetService projetService;

    @Test
    public void creationParrain(){

    }
}
