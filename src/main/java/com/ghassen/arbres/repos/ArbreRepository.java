package com.ghassen.arbres.repos;


import org.springframework.data.jpa.repository.JpaRepository;
import com.ghassen.arbres.entities.Arbre;


public interface ArbreRepository extends JpaRepository<Arbre, Long> {
}