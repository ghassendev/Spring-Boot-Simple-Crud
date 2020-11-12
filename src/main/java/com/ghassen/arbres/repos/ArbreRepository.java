package com.ghassen.arbres.repos;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ghassen.arbres.entities.Arbre;
import com.ghassen.arbres.entities.Categorie;

@RepositoryRestResource(path = "rest")
public interface ArbreRepository extends JpaRepository<Arbre, Long> {

	List<Arbre> findByNomArbre(String nom);
	List<Arbre> findByNomArbreContains(String nom); 
	@Query("select p from Arbre p where p.nomArbre like %?1 and p.prixArbre > ?2")
	List<Arbre> findByNomPrix (String nom, Double prix);
	@Query("select p from Arbre p where p.categorie = ?1")
	List<Arbre> findByCategorie (Categorie categorie);
	List<Arbre> findByCategorieIdCat(Long id);
	List<Arbre> findByOrderByNomArbreAsc();
	@Query("select p from Arbre p order by p.nomArbre ASC, p.prixArbre DESC")
	List<Arbre> trierArbresNomsPrix ();
}