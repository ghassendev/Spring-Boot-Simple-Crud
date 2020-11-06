package com.ghassen.arbres.service;


import java.util.List;

import  com.ghassen.arbres.entities.Arbre;
import com.ghassen.arbres.entities.Categorie;

public interface ArbreService {


		Arbre saveArbre(Arbre a);
		Arbre updateArbre(Arbre a);
		void deleteArbre(Arbre a);
		void deleteArbreById(Long id);
		Arbre getArbre(Long id);
		List<Arbre> getAllArbres();
		List<Arbre> findByNomProduit(String nom);
		List<Arbre> findByNomProduitContains(String nom);
		List<Arbre> findByNomPrix (String nom, Double prix);
		List<Arbre> findByCategorie (Categorie categorie);
		List<Arbre> findByCategorieIdCat(Long id);
		List<Arbre> findByOrderByNomArbreAsc();
		List<Arbre> trierArbresNomsPrix();

	}

