package com.example.archeologie.Model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Equipe_parcelle", uniqueConstraints={
        @UniqueConstraint(columnNames = {"parcelle_id", "date"})
})
public class EquipeParcelle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date date;

    @ManyToOne
    @JoinColumn(name="equipe_id", nullable=false)
    private Equipe equipe;

    @ManyToOne
    @JoinColumn(name="parcelle_id", nullable=false)
    private Parcelle parcelle;


    @OneToMany(mappedBy = "equipeParcelle")
    private List<Objet> objets = new ArrayList<Objet>();
}
