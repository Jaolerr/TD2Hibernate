package com.inti.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRole;
	private String nomRole;
	@ManyToMany
	@JoinTable(name = "Utilisateur_Role", joinColumns = @JoinColumn(name="idRole"),inverseJoinColumns = @JoinColumn(name="idU"))
	private List<Utilisateur> listUtilisateurs;
}
