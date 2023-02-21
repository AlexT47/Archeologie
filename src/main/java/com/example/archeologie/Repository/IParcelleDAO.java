package com.example.archeologie.Repository;

import com.example.archeologie.Model.Parcelle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IParcelleDAO extends JpaRepository<Parcelle, Long> {
}
