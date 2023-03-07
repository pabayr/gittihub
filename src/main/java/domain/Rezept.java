package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashMap;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Rezept {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private Essenskategorie essenskategorie;
    @ElementCollection
    @MapKeyColumn(name="name")
    @Column(name="value")
    @CollectionTable(name="example_attributes", joinColumns=@JoinColumn(name="example_id"))
    private HashMap<Zutat,Double> zutatenliste;
    private String anleitung;
    private double dauer;
    private boolean vegetarisch;
}
