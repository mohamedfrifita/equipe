package com.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esprit.spring.entity.Equipe;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe,Integer> {

}
