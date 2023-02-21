package com.example.archeologie.Model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Equipe")
public class Equipe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nom;

    @OneToOne
    @JoinColumn(name="chef_id", nullable=false)
    private Archeologue chef;

    @OneToMany(mappedBy = "equipe")
    private List<Archeologue> membres = new ArrayList<Archeologue>();

    @ManyToOne
    @JoinColumn(name="directeur_id", nullable=false)
    private Directeur directeur;

    @OneToMany(mappedBy = "equipe")
    private List<EquipeParcelle> equipeParcelles = new ArrayList<EquipeParcelle>();
}
