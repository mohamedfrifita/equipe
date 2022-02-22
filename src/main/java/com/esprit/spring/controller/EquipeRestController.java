package com.esprit.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.spring.entity.Equipe;

import com.esprit.spring.service.IEquipeService;

@RestController
public class EquipeRestController {
	@Autowired
	IEquipeService equipeService;
	
	
	// http://localhost:8081/SpringMVC/servlet/add-Equipe
	
			@PostMapping("/add-Equipe")
			@ResponseBody
			 public void ajouterEquipe(@RequestBody Equipe equipe) {
				equipeService.ajouterEquipe(equipe);
				
				
			}
			
			// http://localhost:8081/SpringMVC/servlet/afficherEquipe/{idEquipe}
			@GetMapping("/afficherEquipe/{idEquipe}")
			@ResponseBody
			public Equipe afficherEquipe( @PathVariable("idEquipe")int idEquipe) {
			return equipeService.afficherEquipe(idEquipe);
			}
			
			// http://localhost:8081/SpringMVC/servlet/modify-user 
			@PutMapping("/modify-user") 
			@ResponseBody
			public Equipe modifyEquipe(@RequestBody Equipe equipe) {
			return equipeService.updateEquipe(equipe);
			}
			
			
			// http://localhost:8081/SpringMVC/servlet/remove-equipe/{equipe-id}
			@DeleteMapping("/remove-equipe/{equipe-id}") 
			@ResponseBody
			public void removeEquipe(@PathVariable("equipe-id") int id) { 
			equipeService.deleteEquipe(id);
			}

}
