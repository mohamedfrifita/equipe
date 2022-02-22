package com.esprit.spring.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.spring.entity.Equipe;

import com.esprit.spring.repository.EquipeRepository;
@Service
public class EquipeServiceImpl implements IEquipeService {
	@Autowired
	 EquipeRepository equipeRepository;
	
	private static final Logger L = LogManager.getLogger(EquipeServiceImpl.class);

	@Override
	public void ajouterEquipe(Equipe equipe) {
		equipeRepository.save(equipe);
		
	}

	@Override
	public Equipe afficherEquipe(int idEquipe) {
		
		return equipeRepository.findById(idEquipe).get() ;
	}

	 @Override
	 public Equipe updateEquipe(Equipe e) {
		 return equipeRepository.save(e);
	 }
	
	@Override
    public void deleteEquipe(int id) {
        equipeRepository.deleteById(id);
    }

}
