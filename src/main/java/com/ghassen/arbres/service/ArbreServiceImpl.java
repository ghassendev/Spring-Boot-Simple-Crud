
package com.ghassen.arbres.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import  com.ghassen.arbres.entities.Arbre;
import com.ghassen.arbres.entities.Categorie;
import com.ghassen.arbres.repos.ArbreRepository;

@Service
public class ArbreServiceImpl implements ArbreService{

	@Autowired
	ArbreRepository arbreRepository;
	
	@Override
	public Arbre saveArbre(Arbre a) {
		return arbreRepository.save(a);
	}

	@Override
	public Arbre updateArbre(Arbre a) {
		return arbreRepository.save(a);
	}

	@Override
	public void deleteArbre(Arbre a) {
		arbreRepository.delete(a);
		
	}

	@Override
	public void deleteArbreById(Long id) {
		arbreRepository.deleteById(id);
		
	}

	@Override
	public Arbre getArbre(Long id) {
		return arbreRepository.findById(id).get();
	}

	@Override
	public List<Arbre> getAllArbres() {
		
		return arbreRepository.findAll();
	}

	@Override
	public List<Arbre> findByNomProduit(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Arbre> findByNomProduitContains(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Arbre> findByNomPrix(String nom, Double prix) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Arbre> findByCategorie(Categorie categorie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Arbre> findByCategorieIdCat(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Arbre> findByOrderByNomArbreAsc() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Arbre> trierArbresNomsPrix() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
