package initiativep.services;

import initiativep.dto.UtilBoxDto;
import initiativep.model.UtilBox;
import initiativep.repository.UtilBoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtilBoxService {
    @Autowired
    private UtilBoxRepository utilBoxRepository;

    public UtilBox createUtilbox(UtilBoxDto utilBoxDto){
        UtilBox utilBox = UtilBox.builder()
                .name(utilBoxDto.getName())
                .utility(utilBoxDto.getUtility())
                .build();
        return utilBoxRepository.save(utilBox);
    }
    public UtilBox updateUtilBox(Long id, UtilBoxDto utilBoxDto){
        UtilBox utilBox= utilBoxRepository.findById(id);
        utilBox.setName(utilBoxDto.getName());
        utilBox.setUtility(utilBoxDto.getUtility());
        return utilBoxRepository.save(utilBox);
    }

}
