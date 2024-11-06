package initiativep.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import initiativep.dto.ParrainDto;
import initiativep.dto.RegisterParrainDto;
import initiativep.model.Parrain;

@Service
public interface ParrainService {
    void saveParrain(ParrainDto parrain);
    void saveParrain(RegisterParrainDto parrainMapping);
    Optional<Parrain>findByName(String name);
    Optional<Parrain>findByEmail(String email);
    List<Parrain>findAll();
}
