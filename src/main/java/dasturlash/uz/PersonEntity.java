package dasturlash.uz;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "person")
public class PersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;

    @OneToMany(mappedBy = "person")
    private List<CarEntity> carList;
    // getter-setter
}







