package com.example.archeologie.Model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Categorie_objet")
public class CategorieObjet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nom;

    @OneToMany(mappedBy = "categorie")
    private List<Objet> objets = new ArrayList<Objet>();
}
