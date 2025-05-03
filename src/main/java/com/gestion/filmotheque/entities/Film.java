// Film.java
package com.gestion.filmotheque.entities;

import jakarta.persistence.*;
import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Entity
public class Film {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titre;
    private String description;
    private int anneeparution;

    @ManyToOne
    private Categorie categorie;

    @ManyToMany
    @JoinTable(
            name = "film_acteurs",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "acteur_id")
    )
    private List<Acteur> acteurs;
}
