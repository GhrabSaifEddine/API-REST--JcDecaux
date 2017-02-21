package com.jcdecaux.recruiting.developpers.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author GHRAB Saif Eddine
 *
 */
@Entity
@Table(name = "DEVELOPPER")
public class DevelopperEntity {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_developper")
	private int idDevelopper;
	
	@Column(name = "nom_developper")
	private String nomDevelopper;
	
	@Column(name = "poste_developper")
	private String posteDevelopper;
	
	@Column(name = "annee_exp_developper")
	private int anneeExpDevelopper;

	public int getIdDevelopper() {
		return idDevelopper;
	}

	public void setIdDevelopper(int idDevelopper) {
		this.idDevelopper = idDevelopper;
	}

	public String getNomDevelopper() {
		return nomDevelopper;
	}

	public void setNomDevelopper(String nomDevelopper) {
		this.nomDevelopper = nomDevelopper;
	}

	public String getPosteDevelopper() {
		return posteDevelopper;
	}

	public void setPosteDevelopper(String posteDevelopper) {
		this.posteDevelopper = posteDevelopper;
	}

	public int getAnneeExpDevelopper() {
		return anneeExpDevelopper;
	}

	public void setAnneeExpDevelopper(int anneeExpDevelopper) {
		this.anneeExpDevelopper = anneeExpDevelopper;
	}

	public DevelopperEntity(int idDevelopper, String nomDevelopper, String posteDevelopper, int anneeExpDevelopper) {
		super();
		this.idDevelopper = idDevelopper;
		this.nomDevelopper = nomDevelopper;
		this.posteDevelopper = posteDevelopper;
		this.anneeExpDevelopper = anneeExpDevelopper;
	}

	public DevelopperEntity() {
		super();
	}
	
	
}
