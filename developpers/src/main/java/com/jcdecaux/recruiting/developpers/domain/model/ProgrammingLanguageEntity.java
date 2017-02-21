package com.jcdecaux.recruiting.developpers.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @author GHRAB Saif Eddine
 *
 */
@Entity
@Table(name = "PRG_LG")
public class ProgrammingLanguageEntity {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_language")
	private int idLanguage;
	
	@Column(name = "libelle_language")
	private String libelleLanguage;

	public int getIdLanguage() {
		return idLanguage;
	}

	public void setIdLanguage(int idLanguage) {
		this.idLanguage = idLanguage;
	}

	public String getLibelleLanguage() {
		return libelleLanguage;
	}

	public void setLibelleLanguage(String libelleLanguage) {
		this.libelleLanguage = libelleLanguage;
	}

	public ProgrammingLanguageEntity(int idLanguage, String libelleLanguage, DevelopperEntity developper) {
		super();
		this.idLanguage = idLanguage;
		this.libelleLanguage = libelleLanguage;
	}

	public ProgrammingLanguageEntity() {
		super();
	}
	
	
}
