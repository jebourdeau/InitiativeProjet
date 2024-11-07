package initiativep.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Porteur extends User{


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "porteur_roles",
            joinColumns = @JoinColumn(name ="porteur_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roles = new HashSet<>();

    private SecteurActivite reseaux;
}
