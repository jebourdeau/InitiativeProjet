package initiativep.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Entity
@Setter
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "utilbox")
public class UtilBox {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String utility;
}
