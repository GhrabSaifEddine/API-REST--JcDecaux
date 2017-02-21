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
@Table(name = "ASSOCIATION_PRG_LG_DEV")
public class AssociationLanguageDevelopperEntity {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_association")
	private int idAssociation;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "id_developper", referencedColumnName = "id_developper")
	private DevelopperEntity developper;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "id_language", referencedColumnName = "id_language")
	private ProgrammingLanguageEntity programmingLanguage;

	public int getIdAssociation() {
		return idAssociation;
	}

	public void setIdAssociation(int idAssociation) {
		this.idAssociation = idAssociation;
	}

	public DevelopperEntity getDevelopper() {
		return developper;
	}

	public void setDevelopper(DevelopperEntity developper) {
		this.developper = developper;
	}

	public ProgrammingLanguageEntity getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(ProgrammingLanguageEntity programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}

	public AssociationLanguageDevelopperEntity(int idAssociation, DevelopperEntity developper,
			ProgrammingLanguageEntity programmingLanguage) {
		super();
		this.idAssociation = idAssociation;
		this.developper = developper;
		this.programmingLanguage = programmingLanguage;
	}

	public AssociationLanguageDevelopperEntity() {
		super();
	}
}
