package com.example.archeologie.Model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Parcelle")
public class Parcelle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String numero;

    private double longeur;

    private double largeur;

    @ManyToOne
    @JoinColumn(name="fouille_id", nullable=false)
    private Fouille fouille;

    @OneToMany(mappedBy = "parcelle")
    private List<EquipeParcelle> equipeParcelles = new ArrayList<EquipeParcelle>();
}
