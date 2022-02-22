package com.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="T_Joueur")
public class Joueur implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String nom;
	private String mot_de_passe ;
	private int num_maillot;
	@JsonIgnore
	@ManyToOne
	private Equipe equipe;
	
	
	
	public Equipe getEquipe() {
		return equipe;
	}
	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getMot_de_passe() {
		return mot_de_passe;
	}
	public void setMot_de_passe(String mot_de_passe) {
		this.mot_de_passe = mot_de_passe;
	}
	public int getNum_maillot() {
		return num_maillot;
	}
	public void setNum_maillot(int num_maillot) {
		this.num_maillot = num_maillot;
	}
	public Joueur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Joueur(long id, String nom, String mot_de_passe, int num_maillot) {
		super();
		this.id = id;
		this.nom = nom;
		this.mot_de_passe = mot_de_passe;
		this.num_maillot = num_maillot;
	}
	@Override
	public String toString() {
		return "Joueur [id=" + id + ", nom=" + nom + ", mot_de_passe=" + mot_de_passe + ", num_maillot=" + num_maillot
				+ "]";
	}
	
	
	
	

}
