package com.inti.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Commande {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCommande;
	private LocalDate date;
	@ManyToOne()
	@JoinColumn(name="idU")
	private Utilisateur user;
	public Commande(int idCommande, LocalDate date, Utilisateur user) {
		super();
		this.idCommande = idCommande;
		this.date = date;
		this.user = user;
	}
	public Commande(LocalDate date) {
		super();
		this.date = date;
	}
	public int getIdCommande() {
		return idCommande;
	}
	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Utilisateur getUser() {
		return user;
	}
	public void setUser(Utilisateur user) {
		this.user = user;
	}
	
	
	

}
