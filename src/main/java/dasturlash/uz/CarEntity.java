package dasturlash.uz;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class CarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "model")
    private String model;
    @Column(name = "color")
    private String color;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private PersonEntity person;
    // getter-setter
}







