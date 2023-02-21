package com.example.archeologie.Repository;

import com.example.archeologie.Model.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEquipeDAO extends JpaRepository<Equipe, Long> {
}
