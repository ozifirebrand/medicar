package agric.thrive.medicar.data.models.symptoms;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
@Getter
@Setter
public class Symptoms {
    @Id
    private String id;
}
