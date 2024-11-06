package Initiative.initiativeprojet.services;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import initiativep.repository.ParrainRepository;
import initiativep.repository.UserRepository;
import initiativep.services.UserService;


@SpringBootTest
public class InitiativeTest {

    @Mock
    private UserRepository userRepository;
    @Mock
    private ParrainRepository parrainRepository;
    @InjectMocks
    private UserService userService;

    @Test
    public void creationParrainain(){
        
    }
}
