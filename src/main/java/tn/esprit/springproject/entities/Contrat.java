package tn.esprit.springproject.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter@AllArgsConstructor
@NoArgsConstructor
@Setter

@Builder
public class Contrat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContrat;
    @Temporal(TemporalType.DATE)
    private Date dateDebutContrat;
    @Temporal(TemporalType.DATE)
    private Date dateFinContrat;
    private Boolean archive;
    private int montant;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;

    @ManyToOne
    private Etudiant etudiant;



}
