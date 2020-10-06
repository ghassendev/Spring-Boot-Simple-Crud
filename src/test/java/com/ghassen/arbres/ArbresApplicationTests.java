package com.ghassen.arbres;



import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.ghassen.arbres.entities.Arbre;
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










}
