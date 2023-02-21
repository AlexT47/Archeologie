package com.example.archeologie.Model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "Fouille")
public class Fouille {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name="ville_id", nullable=false)
    private Ville ville;

    @OneToMany(mappedBy = "fouille")
    private List<Parcelle> parcelles = new ArrayList<Parcelle>();
}
