package com.jcdecaux.recruiting.developpers.service.rest.impl;

import java.util.List;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jcdecaux.recruiting.developpers.domain.model.AssociationLanguageDevelopperEntity;
import com.jcdecaux.recruiting.developpers.domain.model.DevelopperEntity;
import com.jcdecaux.recruiting.developpers.domain.model.ProgrammingLanguageEntity;
import com.jcdecaux.recruiting.developpers.domain.service.AssociationLanguageDevelopperService;
import com.jcdecaux.recruiting.developpers.domain.service.ProgrammingLanguageService;
import com.jcdecaux.recruiting.developpers.service.rest.AssociationLanguageDevelopperResource;
import com.jcdecaux.recruiting.developpers.service.rest.ProgrammingLanguageResource;

/**
 * 
 * @author GHRAB Saif Eddine
 *
 */

@Service
public class AssociationLanguageDevelopperResourceImpl implements AssociationLanguageDevelopperResource {

	@Autowired
	private AssociationLanguageDevelopperService service;
	
	/** La constante LOG. */
	private static final Logger LOG= Logger.getLogger(Class.class);

	@Override
	public List<DevelopperEntity>  getAllDeveloppersByLanguage(int idLangage) {
		List<DevelopperEntity> allDevsByIdPrg=service.getAllDeveloppersByLanguage(idLangage);
		LOG.info("Récupérer les développeurs ayant un langage dont l'id est : "+idLangage);
		return allDevsByIdPrg;
	}

	@Override
	public List<ProgrammingLanguageEntity>  getAllLanguagesByDevelopper(int idDevelopper) {
		List<ProgrammingLanguageEntity> allProgramsByIdDev=service.getAllLanguagesByDevelopper(idDevelopper);
		LOG.info("Récupérer les langages détenus par le développeur dont l'id est : "+idDevelopper);
		return allProgramsByIdDev;
	}

	/** Cette méthode permet de créer/modifier une association entre developpeur- langage programmation, qui est traduite par le fait d'AFFECTER un langage
	    de programmation à un développeur et sauvegarder la transaction dans l'entité AssociationLanguageDevelopperEntity. */
	@Override
	public void saveAssociation(AssociationLanguageDevelopperEntity association) {
		service.saveAssociationLanguageDevelopper(association);
		LOG.info("Add / update d'une association est en cours ... ");
	}

	@Override
	public List<AssociationLanguageDevelopperEntity> getAllAssociations() {
		List<AssociationLanguageDevelopperEntity> allAssociations= service.getAllAssociations();
		LOG.info("Retounre toutes les associations existantes dans l'entité AssociationLanguageDevelopperEntity");
		return allAssociations;
	}
}
