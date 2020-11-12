package com.ghassen.arbres.entities;


import org.springframework.data.rest.core.config.Projection;
@Projection(name = "nomArb", types = { Arbre.class })
public interface ArbreProjection {
	public String getNomArbre();


}
