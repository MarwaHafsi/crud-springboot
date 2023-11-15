package com.fst.Application.controllers;
import static com.fst.Application.DemoApplication.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fst.srt.entities.Etudiant;

@Controller
@RequestMapping("/Etudiant")
public class EtudiantController {
@RequestMapping("/Etud")
	public String Etud(Model model) {
	model.addAttribute("etudiants", etudiants);
		return "ListEtud.html";

}
@GetMapping("/student")
public String publier() {
   return "formAddEtud.html";
}
@PostMapping("/student")
//@ResponseBody bech tab3ath biha msg
public String ajouter(@RequestParam("id")int id,@RequestParam("nom")String nom,@RequestParam("prenom")String prenom,@RequestParam("email")String email,@RequestParam("adresse")String adresse) {
	  
	   Etudiant e4=new Etudiant(id,nom,prenom,email,adresse);
	   etudiants.add(e4);
	   return "redirect:Etud" ;
	
}
@GetMapping("delete/{id}")
//@ResponseBody
public String supprimer(@PathVariable("id") int id)
{
	//model.addAttribute("id", id);
	for(Etudiant e:etudiants)
	{
	if(e.getId()==id)
	{
	etudiants.remove(e);
			break;
	}
	}
	
	return "redirect:../Etud";
			
}
}
