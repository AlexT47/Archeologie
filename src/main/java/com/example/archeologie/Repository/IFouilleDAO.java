package com.example.archeologie.Repository;

import com.example.archeologie.Model.Fouille;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFouilleDAO extends JpaRepository<Fouille, Long> {
}
