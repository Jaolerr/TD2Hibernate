package com.inti.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Utilisateur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String login;
	private String mdp;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idUD", nullable = false)
//	@JoinTable(name = "Utilisateur_UD",
//				joinColumns = @JoinColumn(name = "idU"),
//				inverseJoinColumns = @JoinColumn(name = "idUD"))
	private UtilisateurDetails utilisateurDetails;
	
	@OneToMany(mappedBy = "user", targetEntity = Commande.class)
	private List<Commande> listCommande;
	
	@ManyToMany
	@JoinTable(name = "Utilisateur_Role", joinColumns = @JoinColumn(name="idU"),inverseJoinColumns = @JoinColumn(name="idRole"))
	private List<role> listRole;
	
	public UtilisateurDetails getUtilisateurDetails() {
		return utilisateurDetails;
	}

	public void setUtilisateurDetails(UtilisateurDetails utilisateurDetails) {
		this.utilisateurDetails = utilisateurDetails;
	}

	public Utilisateur() {
		super();
	}

	public Utilisateur(String login, String mdp) {
		super();
		this.login = login;
		this.mdp = mdp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", login=" + login + ", mdp=" + mdp + "]";
	}
	
	

}
