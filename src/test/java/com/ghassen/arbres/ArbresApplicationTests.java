package com.ghassen.arbres;



import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.ghassen.arbres.entities.Arbre;
import com.ghassen.arbres.entities.Categorie;
import com.ghassen.arbres.repos.ArbreRepository;
@SpringBootTest
class ArbresApplicationTests {
@Autowired
private ArbreRepository arbreRepository;
@Test
public void testCreateProduit() {
Arbre arb = new Arbre("Citron",3200.600,new Date());
arbreRepository.save(arb);
}
@Test
public void testFindArbre()
{
Arbre a = arbreRepository.findById(1L).get();
System.out.println(a);
}
@Test
public void testUpdateArbre()
{
Arbre a = arbreRepository.findById(1L).get();
a.setPrixArbre(1000.0);
arbreRepository.save(a);
}
@Test
public void testDeleteArbre()
{
arbreRepository.deleteById(1L);;
}

@Test
public void testListerTousArbres()
{
List<Arbre> arbs = arbreRepository.findAll();
for (Arbre a : arbs)
{
System.out.println(a);
}
}

@Test
public void testFindByNomProduit()
{
	List<Arbre> prods = arbreRepository.findByNomArbre("Citron");
	for (Arbre p : prods)
	{
		System.out.println(p);
	}
}
@Test
public void testFindByNomProduitContains ()
{
	List<Arbre> prods=arbreRepository.findByNomArbreContains("Citron");
	for (Arbre p : prods)
	{
		System.out.println(p);
	} 
}


@Test
	public void testfindByNomPrix()
	{
		List<Arbre> arbres = arbreRepository.findByNomPrix("Citron", 1000.0);
		for (Arbre p : arbres)
		{
			System.out.println(p);
		}
	}

	@Test
	public void testfindByCategorie()
	{
		Categorie cat = new Categorie();
		cat.setIdCat(1L);
		List<Arbre> prods = arbreRepository.findByCategorie(cat);
		for (Arbre p : prods)
		{
			System.out.println(p);
		}
	}

	@Test
	public void findByCategorieIdCat()
	{
	List<Arbre> prods = arbreRepository.findByCategorieIdCat(1L);
	for (Arbre p : prods)
	{
		System.out.println(p);
	}
	}
	@Test
	public void testfindByOrderByNomProduitAsc()
	{
	List<Arbre> prods =arbreRepository.findByOrderByNomArbreAsc();
	for (Arbre p : prods)
	{
	System.out.println(p);
	}
	}

	@Test
	public void testTrierProduitsNomsPrix()
	{
	List<Arbre> prods = arbreRepository.trierArbresNomsPrix();
	for (Arbre p : prods)
	{
	System.out.println(p);
	}
	}



}
