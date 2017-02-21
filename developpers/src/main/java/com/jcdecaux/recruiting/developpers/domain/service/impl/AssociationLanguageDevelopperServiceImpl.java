package com.jcdecaux.recruiting.developpers.domain.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jcdecaux.recruiting.developpers.domain.model.AssociationLanguageDevelopperEntity;
import com.jcdecaux.recruiting.developpers.domain.model.DevelopperEntity;
import com.jcdecaux.recruiting.developpers.domain.model.ProgrammingLanguageEntity;
import com.jcdecaux.recruiting.developpers.domain.repository.AsoociationLanguageDevelopperRepository;
import com.jcdecaux.recruiting.developpers.domain.service.AssociationLanguageDevelopperService;

/**
 * 
 * @author GHRAB Saif Eddine
 *
 */

@Component
public class AssociationLanguageDevelopperServiceImpl implements AssociationLanguageDevelopperService {

	@Autowired
	private AsoociationLanguageDevelopperRepository repository;

	@Override
	public List<DevelopperEntity> getAllDeveloppersByLanguage(int idLanguage) {
		List<DevelopperEntity> developpersByIdLanguage=repository.getAllDeveloppersByLanguage(idLanguage);
		return developpersByIdLanguage;
	}

	@Override
	public List<ProgrammingLanguageEntity> getAllLanguagesByDevelopper(int idDevelopper) {
		List<ProgrammingLanguageEntity> languagesByIdDevelopper=repository.getAllLanguagesByDevelopper(idDevelopper);
		return languagesByIdDevelopper;
	}

	@Override
	public void saveAssociationLanguageDevelopper(AssociationLanguageDevelopperEntity association) {
		repository.save(association);
	}

	@Override
	public List<AssociationLanguageDevelopperEntity> getAllAssociations() {
		List<AssociationLanguageDevelopperEntity> allAssociations=(List<AssociationLanguageDevelopperEntity>)repository.findAll();
		return allAssociations;
	}
	


}
