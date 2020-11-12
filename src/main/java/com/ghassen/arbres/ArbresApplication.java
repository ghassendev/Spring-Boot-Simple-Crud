package com.ghassen.arbres;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ghassen.arbres.entities.Arbre;

@SpringBootApplication
public class ArbresApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ArbresApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	}

}
