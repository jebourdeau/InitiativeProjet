package initiativep.repository;

import initiativep.model.UtilBox;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilBoxRepository {
    UtilBox findById(Long id);

    UtilBox save(UtilBox utilBox);
}
