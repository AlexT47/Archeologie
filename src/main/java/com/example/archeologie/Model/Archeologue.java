package com.example.archeologie.Model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
@DiscriminatorValue("A")
public class Archeologue extends Personne{

    @ManyToOne
    private Equipe equipe;
}
