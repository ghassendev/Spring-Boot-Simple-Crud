package com.ghassen.arbres.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ghassen.arbres.entities.Arbre;
import com.ghassen.arbres.service.ArbreService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ArbreRESTController {
	@Autowired
	ArbreService arbreService;
	@RequestMapping(method = RequestMethod.GET)
	public List<Arbre> getAllArbres() {
	return arbreService.getAllArbres();
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Arbre getArbreById(@PathVariable("id") Long id) {
	return arbreService.getArbre(id);
	 }
	@RequestMapping(method = RequestMethod.POST)
	public Arbre createArbre(@RequestBody Arbre arbre) {
	return arbreService.saveArbre(arbre);
	}
	@RequestMapping(method = RequestMethod.PUT)
	public Arbre updateArbre(@RequestBody Arbre arbre) {
	return arbreService.updateArbre(arbre);
	}

	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteArbre(@PathVariable("id") Long id)
	{
	arbreService.deleteArbreById(id);
	}
	
	@RequestMapping(value="/prodscat/{idCat}",method = RequestMethod.GET)
	public List<Arbre> getArbresByCatId(@PathVariable("idCat") Long idCat) {
	return arbreService.findByCategorieIdCat(idCat);
	}
	
	
}
