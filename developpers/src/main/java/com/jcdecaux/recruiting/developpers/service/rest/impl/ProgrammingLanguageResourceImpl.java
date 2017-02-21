package com.jcdecaux.recruiting.developpers.service.rest.impl;

import java.util.List;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jcdecaux.recruiting.developpers.domain.model.ProgrammingLanguageEntity;
import com.jcdecaux.recruiting.developpers.domain.service.ProgrammingLanguageService;
import com.jcdecaux.recruiting.developpers.service.rest.ProgrammingLanguageResource;

/**
 * 
 * @author GHRAB Saif Eddine
 *
 */

@Service
public class ProgrammingLanguageResourceImpl implements ProgrammingLanguageResource {

	@Autowired
	private ProgrammingLanguageService service;
	
	/** La constante LOG. */
	private static final Logger LOG= Logger.getLogger(Class.class);

	@Override
	@Produces(MediaType.APPLICATION_JSON)
	public List<ProgrammingLanguageEntity> getAllProgrammingLanguages() {
		List<ProgrammingLanguageEntity> allPrograms= service.getProgrammingLanguages();
		LOG.info("Taille de la Liste des developpeurs : " + allPrograms.size());
		return allPrograms;
	}

	@Override
	public String getAllProgrammingLanguagesTest() {
		LOG.info("Liste des developpeurs convertie en String");
		StringBuilder result = new StringBuilder();
		for (ProgrammingLanguageEntity programm : service.getProgrammingLanguages()) {
			result.append(programm.getIdLanguage()).append("   ").append(programm.getLibelleLanguage()).append("   ").append("\n");
		}
		return result.toString();
	}

	@Override
	public void saveProgrammingLanguage(ProgrammingLanguageEntity language) {
		LOG.info("ADD / UPDATE du developpeur");
		service.saveProgrammingLanguage(language);
	}

}
