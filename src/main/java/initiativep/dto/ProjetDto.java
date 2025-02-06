package initiativep.dto;

import initiativep.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProjetDto {
    public long getIdUser() {
        return 0;
    }

    public String getNomProjet() {
        return null;
    }

    public List<User> getMembres() {
        return null;
    }

}
