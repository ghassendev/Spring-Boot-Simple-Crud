package com.ghassen.arbres.service;


import java.util.List;

import  com.ghassen.arbres.entities.Arbre;

public interface ArbreService {


		Arbre saveArbre(Arbre a);
		Arbre updateArbre(Arbre a);
		void deleteArbre(Arbre a);
		 void deleteArbreById(Long id);
		 Arbre getArbre(Long id);
		List<Arbre> getAllArbres();
	}

