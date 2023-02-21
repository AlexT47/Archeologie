package com.example.archeologie.Repository;

import com.example.archeologie.Model.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonneDAO extends JpaRepository<Personne, Long> {
}
