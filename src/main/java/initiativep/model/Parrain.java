package initiativep.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Entity
@Setter
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "parrain")
public class Parrain {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String entreprise;

    private String email;
    private String password;
    


}
