package initiativep.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Projet {

    @Id
    @GeneratedValue
    private Long id;

    private String name;


}
