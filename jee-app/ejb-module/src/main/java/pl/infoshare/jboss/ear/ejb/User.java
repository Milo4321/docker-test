package pl.infoshare.jboss.ear.ejb;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Getter
@Setter
public class User implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private String name;
}
