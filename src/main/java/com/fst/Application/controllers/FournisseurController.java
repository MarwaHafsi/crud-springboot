package com.fst.Application.controllers;

import java.util.ArrayList;
import java.util.List;
import static com.fst.Application.DemoApplication.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fst.srt.entities.Client;
@Controller
@RequestMapping("/fournisseur")
public class FournisseurController {
@GetMapping("/clients")
//@ResponseBody 
	public String info(Model model){

		List<String> noms=new ArrayList<>();
		noms.add("Ameni");
		noms.add("marwa");
		noms.add("rima");
		noms.add("marwa");
		String enseignant="nader belhadj";
		String classe="srt";
		int number=5333333;
		model.addAttribute("ens",enseignant);
		model.addAttribute("cl",classe);
		model.addAttribute("num",number);
		model.addAttribute("nom",noms);
		model.addAttribute("clients", clients);
		
		

		return "data.html";
			
		
	}
//getMapping ki n7eb njib page html teb3a lget mte3 data 
   @GetMapping("/client")
    public String publier() {
	   return "client.html";
   }
   @PostMapping("/client")
   //@ResponseBody bech tab3ath biha msg
   public String ajouter(@RequestParam("id")int id,@RequestParam("nom")String nom,@RequestParam("prenom")String prenom,@RequestParam("email")String email) {
	  
	   //return "Bienvenue mr:nader" +nom+ "votre prenom est" + prenom  + "votre email  est"+email;
	   Client c4=new Client(id,nom,prenom,email);
	   clients.add(c4);
	   return "redirect:clients" ;
	
  }
   /*@PostMapping("/client")
   //@ResponseBody bech tab3ath biha msg
   @ResponseBody
   public String ajouters(@RequestParam("nom")String nom,@RequestParam("prenom")String prenom,@RequestParam("email")String email) {
	  
	   return "Bienvenue mr:nader" +nom+ "votre prenom est" + prenom  + "votre email  est"+email;
	  
	
  }*/
   @GetMapping("delete/{id}")
	//@ResponseBody
	public String supprimer(@PathVariable("id") int id)
	{
		//model.addAttribute("id", id);
		for(Client c:clients)
		{
		if(c.getId()==id)
		{
		clients.remove(c);
				break;
		}
		}
		
		return "redirect:../clients";
				
	}}
		   //maya3mlch redirection khatr mch fi page okhra
	   //return "../clients";}
  
  
  

