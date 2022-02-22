package com.esprit.spring.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="T_Equipe")
public class Equipe implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nom;
	@Temporal(TemporalType.DATE)
	private Date date_creation;
	
	@JsonIgnore
	@OneToMany(mappedBy="equipe", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, fetch=FetchType.LAZY)
	private List<Joueur>joueurs = new ArrayList<>();
	
	
	
	
	public List<Joueur> getJoueurs() {
		return joueurs;
	}
	public void setJoueurs(List<Joueur> joueurs) {
		this.joueurs = joueurs;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	public Equipe(int id, String nom, Date date_creation) {
		super();
		this.id = id;
		this.nom = nom;
		this.date_creation = date_creation;
	}
	public Equipe() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Equipe [id=" + id + ", nom=" + nom + ", date_creation=" + date_creation + "]";
	}
	
	

}
