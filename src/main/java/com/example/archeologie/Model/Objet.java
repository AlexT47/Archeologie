package com.example.archeologie.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Objet")
public class Objet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String designation;

    @Temporal(TemporalType.DATE)
    private Date dateDecouverte;

    @Enumerated(EnumType.STRING)
    private EtatCompletude etatCompletude;

    private boolean restaurer;

    @ManyToOne
    @JoinColumn(name="categorie_id", nullable=false)
    private CategorieObjet categorie;

    @ManyToOne
    @JoinColumn(name="equipe_parcelle_id", nullable=false)
    private EquipeParcelle equipeParcelle;
}
