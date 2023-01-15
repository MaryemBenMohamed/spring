package tn.esprit.springproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DetailEquipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDetailDepart")
    private Integer idDetailDepart;
    private Integer salle;
    private String thematique;
    @OneToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    private Equipe equipe;


}
