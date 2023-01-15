package tn.esprit.springproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "table_etudiant")
public class  Etudiant implements Serializable {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="idEtudiant")
    private Integer idEtudiant; // Clé primaire

    private String prenomE;
    @Column(name="etudiant_nom")
    private String nomE;

    @Enumerated(EnumType.STRING)

    private Option op;
    @JsonIgnore
    @OneToMany(mappedBy="etudiant")
    private Set<Contrat> Contrats;

    @ManyToOne(cascade = CascadeType.ALL)
    private Departement departement;

    @ManyToMany(cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Equipe> equipes = new HashSet<>();


}
