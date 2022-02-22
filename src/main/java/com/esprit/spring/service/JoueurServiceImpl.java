package com.esprit.spring.service;





import java.util.List;

import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.esprit.spring.entity.Joueur;

import com.esprit.spring.repository.EquipeRepository;
import com.esprit.spring.repository.JoueurRepository;

@Service
public class JoueurServiceImpl implements IJoueurService {
	@Autowired
	JoueurRepository joueurRepository;
	@Autowired
	EquipeRepository equipeRepository;
	
	private static final Logger L = LogManager.getLogger(JoueurServiceImpl.class);

	@Transactional
	public void ajouterJoueurAffecterEquipe(String nom,String mot_de_passe,int maillot, int equipe_id) {
		joueurRepository.ajouterJoueurAffecterEquipe(nom, mot_de_passe, maillot, equipe_id);
		
	}
	
/*
	@Override
	public void ajouterJoueurAffecterEquipe(Joueur joueur, int idEquipe) {
		List<Joueur>joueurs=new ArrayList<>();
		for(int i=0;i<idEquipe;i++) {
			Equipe equipe = equipeRepository.findById(idEquipe).get();
			joueurs.add(joueur);
		}
		
		joueur.setEquipe(equipe);
		joueurRepository.save(joueur);
			
			
			
		}
		*/

	@Override
	public Joueur afficherJoueur(int idJoueur) {
		
		return joueurRepository.findById((long)idJoueur).get();
	}

	@Override
	public List<Joueur> afficherTousLesJoueurs() {
		List<Joueur> joueurs = (List<Joueur>) joueurRepository.findAll();
		for(Joueur joueur :joueurs) {
			L.info("user +++ :" + joueur);
		}
		return joueurs;
		
	}

	@Override
	public Joueur updateJoueur(Joueur j) {
		
		return joueurRepository.save(j);
	}
	
	 @Override
	    public void deleteJoueur(String id) {
	        joueurRepository.deleteById(Long.parseLong(id));
	    }
	
	
	}	
	
	


