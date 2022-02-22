package com.esprit.spring.service;

import java.util.List;

import com.esprit.spring.entity.Joueur;


public interface IJoueurService {
	public void ajouterJoueurAffecterEquipe (String nom,String mot_de_passe,int maillot, int equipe_id);
	//public void ajouterJoueurAffecterEquipe (Joueur joueur, int idEquipe);
	Joueur afficherJoueur(int idJoueur) ;
	public List<Joueur>afficherTousLesJoueurs();
	public Joueur updateJoueur(Joueur j);
	public void deleteJoueur(String id);

}
