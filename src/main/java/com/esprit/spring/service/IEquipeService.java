package com.esprit.spring.service;

import com.esprit.spring.entity.Equipe;


public interface IEquipeService {
	public void ajouterEquipe (Equipe equipe) ;
	public Equipe afficherEquipe(int idEquipe);
	public Equipe updateEquipe(Equipe e);
	public void deleteEquipe(int id);


}
