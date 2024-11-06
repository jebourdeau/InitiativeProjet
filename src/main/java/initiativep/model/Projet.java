package initiativep.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "projet")
public class Projet {

    @Id
    @GeneratedValue
    private Long id;
    private List<User> membres;
    private String name;

    @ManyToMany
    private User owner;


}
