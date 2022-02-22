package com.esprit.spring.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.esprit.spring.entity.Joueur;

@Repository
public interface JoueurRepository extends JpaRepository<Joueur,Long> {
	
	@Modifying
	@Query(value="INSERT INTO t_Joueur (nom,mot_de_passe,num_maillot, equipe_id) VALUES (:nom,:mot_de_passe,:num_maillot, :equipe_id)", nativeQuery = true)
	 

	
	public void ajouterJoueurAffecterEquipe( @Param ("nom")String nom,@Param ("mot_de_passe")String mot_de_passe,@Param ("num_maillot")int num_maillot,@Param("equipe_id") int equipe_id);

}
