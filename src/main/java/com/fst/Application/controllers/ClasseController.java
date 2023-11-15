package com.fst.Application.controllers;
import static com.fst.Application.DemoApplication.classes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.fst.srt.entities.Classe;

@Controller
@RequestMapping("/classe")
public class ClasseController {
	@RequestMapping("/class")
	public String clase(Model model) {
		model.addAttribute("classes",classes);
		return "ListClass.html";
		
	}
	
	@GetMapping("/classes")
	public String cl() {
		return "formAddClass.html";
	}
	@PostMapping("/classes")
	   //@ResponseBody bech tab3ath biha msg
	   public String ajouter(@RequestParam("id")int id,@RequestParam("nom")String nom) {
		  
		   //return "Bienvenue mr:nader" +nom+ "votre prenom est" + prenom  + "votre email  est"+email;
		   Classe s4=new Classe(id,nom);
		   classes.add(s4);
		   return "redirect:class" ;
		
	  }
	@GetMapping("delete/{id}")
	//@ResponseBody
	public String supprimer(@PathVariable("id") int id)
	{
		//model.addAttribute("id", id);
		for(Classe s:classes)
		{
		if(s.getId()==id)
		{
		classes.remove(s);
				break;
		}
		}
		
		return "redirect:../class";
				
	}
	@GetMapping("update/{id}")
	//@ResponseBody
	public String update(@PathVariable("id") int id,@PathVariable("nom") int nom)
	{
		//model.addAttribute("id", id);
		for(Classe s:classes)
		{
		if(s.getId()==id)
		{
			classes.get(1).setId(3);
			classes.get(1).setNom("marwa");
			

		
		break;
		}
		}
		
		return "redirect:../class";
				
	}
}
	
	
	
	


