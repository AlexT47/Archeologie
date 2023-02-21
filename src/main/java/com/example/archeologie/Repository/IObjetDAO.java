package com.example.archeologie.Repository;

import com.example.archeologie.Model.Objet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IObjetDAO extends JpaRepository<Objet, Long> {
}
