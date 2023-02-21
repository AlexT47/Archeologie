package com.example.archeologie.Model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
@DiscriminatorValue("D")
public class Directeur extends Personne {

    @OneToMany(mappedBy = "directeur")
    private List<Equipe> equipes = new ArrayList<Equipe>();
}
