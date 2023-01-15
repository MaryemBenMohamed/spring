package tn.esprit.springproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idEquipe")
    private Integer idEquipe; // Clé primaire
    private String nomEquipe;
    @Enumerated(EnumType.STRING)
    private Niveau niveau;
    @OneToOne(mappedBy = "equipe", cascade = CascadeType.ALL)
    private DetailEquipe detailEquipe;

    @ManyToMany(mappedBy = "equipes", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Etudiant> etudiants;


}
