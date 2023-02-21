package com.example.archeologie.Model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Ville")
public class Ville {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nom;
    @OneToMany(mappedBy = "ville")
    public List<Fouille> fouilles = new ArrayList<Fouille>();
}
