package initiativep.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Message")
public class Message {
    
    @OneToMany
    private String sender_id;
    
    @OneToMany
    private String receiver_id;
    
}
