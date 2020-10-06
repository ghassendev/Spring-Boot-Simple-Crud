package com.ghassen.arbres.controllers;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import  com.ghassen.arbres.entities.Arbre;
import com.ghassen.arbres.service.ArbreService;

@Controller
public class ArbreController {
	
	
	@Autowired
	ArbreService arbreService;
	
	@RequestMapping("/showCreate")
	public String showCreate()
	{
		return "createArbre";
	}
	
	@RequestMapping("/saveArbre")
	public String saveArbre(@ModelAttribute("arbre") Arbre arbre, 
							  @RequestParam("date") String date,
							  ModelMap modelMap) throws ParseException 
	{
		//conversion de la date 
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        Date dateCreation = dateformat.parse(String.valueOf(date));
        arbre.setDateCreation(dateCreation);
      
        Arbre saveArbre = arbreService.saveArbre(arbre);
		 String msg ="arbre enregistré avec Id "+saveArbre.getIdArbre();
		 modelMap.addAttribute("msg", msg);
		return "createArbre";
	}
	
	@RequestMapping("/ListeArbres")
	public String listeArbres(ModelMap modelMap)
	{
		List<Arbre> arbs = arbreService.getAllArbres();
		modelMap.addAttribute("arbres", arbs);		
		return "listeArbres";	
	}
	
	@RequestMapping("/supprimerArbre")
	public String supprimerArbre(@RequestParam("id") Long id,ModelMap modelMap)
	{
		Arbre a= new Arbre();
		a.setIdArbre(id);
		arbreService.deleteArbre(a);
		List<Arbre> arbs = arbreService.getAllArbres();
		modelMap.addAttribute("arbres", arbs);	
		return "listeArbres";	
	}
	
	@RequestMapping("/modifierArbre")
	public String editerArbre(@RequestParam("id") Long id,ModelMap modelMap)
	{
		Arbre a= 	arbreService.getArbre(id);
		modelMap.addAttribute("arbre", a);	
		return "editerArbre";	
	}

	@RequestMapping("/updateArbre")
	public String updateArbre(@ModelAttribute("arbre") Arbre arbre,
								@RequestParam("date") String date,
			                    ModelMap modelMap) throws ParseException 
	{
		
		//conversion de la date 
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        Date dateCreation = dateformat.parse(String.valueOf(date));
        arbre.setDateCreation(dateCreation);
        
         arbreService.updateArbre(arbre);
		  List<Arbre> arbs = arbreService.getAllArbres();
		  modelMap.addAttribute("arbres", arbs);	
		
		return "listeArbres";
	}

}
