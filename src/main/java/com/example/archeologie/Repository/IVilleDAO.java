package com.example.archeologie.Repository;

import com.example.archeologie.Model.Ville;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVilleDAO extends JpaRepository<Ville, Long> {
}
