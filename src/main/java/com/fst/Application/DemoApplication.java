package com.fst.Application;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fst.srt.entities.Classe;
import com.fst.srt.entities.Client;
import com.fst.srt.entities.Etudiant;

@SpringBootApplication
public class DemoApplication {
	public static  List<Client> clients=new ArrayList<>();
	public static  List<Etudiant> etudiants=new ArrayList<>();
	public static  List<Classe> classes=new ArrayList<>();
	

	public static void main(String[] args) {
		
		Client c1=new Client(1,"Hela","elber","marwa@gmail.com");
		Client c2=new Client(2,"marwa","hafsi","marwa@gmail.com");
		Client c3=new Client(3,"marwa","hafsi","marwa@gmail.com");
		
		clients.add(c1);
		clients.add(c2);
		clients.add(c3);
		//Etudiant
		Etudiant e1=new Etudiant(1,"hafsi","marwa","manouba","marwa@gmail.com");
		Etudiant e2=new Etudiant(1,"hafsi","marwa","manouba","marwa@gmail.com");
		Etudiant e3=new Etudiant(1,"hafsi","marwa","manouba","marwa@gmail.com");
		etudiants.add(e1);
		etudiants.add(e2);
		etudiants.add(e3);
		//Classe
		Classe s1=new Classe(1,"mp2srt");
		Classe s2=new Classe(1,"mp2srt");
		Classe s3=new Classe(1,"mp2srt");
		classes.add(s1);
		classes.add(s2);
		classes.add(s3);
		SpringApplication.run(DemoApplication.class, args);
	}

}
