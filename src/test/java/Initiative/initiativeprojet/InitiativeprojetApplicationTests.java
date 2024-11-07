package Initiative.initiativeprojet;

import initiativep.model.Projet;
import initiativep.model.User;
import initiativep.repository.ProjetRepository;
import initiativep.repository.UserRepository;
import initiativep.services.ProjetService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.MockBeans;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class InitiativeprojetApplicationTests {
	@Mock
	private ProjetRepository projetRepository;

	@Mock
	private UserRepository userRepository;

	@Autowired
	private ProjetService projetService;

	@Test
	public void creationProjet() {
		// Arrange
		long idUser = 1;
		User user = User.builder().id(1L).username("shiipou").build();
		when(userRepository.findById(idUser)).thenReturn(Optional.of(user));
		String nomProjet = "Nouveau Projet";
		Projet projetFromDB = Projet.builder().id(1L).owner(user).nom(nomProjet).build();
		when(projetRepository.save(any(Projet.class))).thenReturn(projetFromDB);

		// Act
		Projet projet = projetService.creationProjet(idUser, nomProjet);

		// Assert
		Assertions.assertEquals(projet.getOwner().getUsername(), user.getUsername());
		Assertions.assertEquals(projet.getNom(), nomProjet);
	}


}
