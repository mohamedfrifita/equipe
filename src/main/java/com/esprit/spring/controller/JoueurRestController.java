package com.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.spring.entity.Joueur;

import com.esprit.spring.service.IJoueurService;

@RestController
public class JoueurRestController {
	@Autowired
	IJoueurService joueurService;
	
	// http://localhost:8081/SpringMVC/servlet/ajouterJoueurAffecterEquipe/{idEquipe}
	@PostMapping("/ajouterJoueurAffecterEquipe/{equipe_id}")
	@ResponseBody
	public void ajouterJoueurAffecterEquipe(@RequestBody Joueur joueur, @PathVariable int equipe_id) {
		joueurService.ajouterJoueurAffecterEquipe(joueur.getNom(),joueur.getMot_de_passe(),joueur.getNum_maillot(), equipe_id);
		
	}
	
	
	
	
	// http://localhost:8081/SpringMVC/servlet/afficherJoueur/{idJoueur}
		@GetMapping("/afficherJoueur/{idJoueur}")
		@ResponseBody
		public Joueur afficherJoueur(@PathVariable("idJoueur") int idJoueur) {
		return joueurService.afficherJoueur(idJoueur);
		}
		
		
		// http://localhost:8081/SpringMVC/servlet/remove-joueur/{joueur-id}
		@DeleteMapping("/remove-joueur/{joueur-id}") 
		@ResponseBody
		public void removeJoueur(@PathVariable("joueur-id") String id) { 
		joueurService.deleteJoueur(id);
		}
		
		
		// http://localhost:8081/SpringMVC/servlet/afficherTousLesJoueurs
		@GetMapping("/afficherTousLesJoueurs")
		@ResponseBody
		public List<Joueur> getJoueurs() {
		List<Joueur> list = joueurService.afficherTousLesJoueurs();
		return list;
		}
		
		// http://localhost:8081/SpringMVC/servlet/modify-joueur 
		@PutMapping("/modify-joueur") 
		@ResponseBody
		public Joueur modifyJoueur(@RequestBody Joueur joueur){
		return joueurService.updateJoueur(joueur);
		}

}
