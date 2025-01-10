package initiativep.services;

import initiativep.dto.ParrainDto;
import initiativep.dto.ProjetDto;
import initiativep.model.Parrain;
import initiativep.model.Projet;
import initiativep.model.User;
import initiativep.repository.ProjetRepository;
import initiativep.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ProjetService {

    @Autowired
    private ProjetRepository projetRepository;

    @Autowired
    private UserRepository userRepository;

    public Projet creationProjet(long idUser, String nomProjet) {
        return this.creationProjet(idUser, nomProjet, new ArrayList<>());
    }
    public void deleteProjet(Long id) {
        projetRepository.deleteById(id);
    }
    public Projet creationProjet(long idUser, String nomProjet, List<User> membres)
            throws NoSuchElementException {
        User user = userRepository.findById(idUser).orElseThrow();

        Projet projet = Projet.builder()
                .owner(user)
                .name(nomProjet)
                .membres(membres)
                .build();

        return projetRepository.save(projet);
    }
    public Projet updateProjet(Long id, ProjetDto projetDto){
        Projet projet = projetRepository.getReferenceById(id);
        projet.setId(projetDto.getIdUser());
        projet.setName(projet.getName());
        return projetRepository.save(projet);
    }
}
