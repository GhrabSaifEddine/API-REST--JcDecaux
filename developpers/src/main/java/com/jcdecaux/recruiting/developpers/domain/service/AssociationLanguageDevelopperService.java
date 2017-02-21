package com.jcdecaux.recruiting.developpers.domain.service;

import java.util.List;

import com.jcdecaux.recruiting.developpers.domain.model.AssociationLanguageDevelopperEntity;
import com.jcdecaux.recruiting.developpers.domain.model.DevelopperEntity;
import com.jcdecaux.recruiting.developpers.domain.model.ProgrammingLanguageEntity;

/**
 * 
 * @author GHRAB Saif Eddine
 *
 */

public interface AssociationLanguageDevelopperService {

	List<DevelopperEntity> getAllDeveloppersByLanguage(int idLanguage);
	
	List<ProgrammingLanguageEntity> getAllLanguagesByDevelopper(int idDevelopper);
	
	List<AssociationLanguageDevelopperEntity> getAllAssociations();

	void saveAssociationLanguageDevelopper(AssociationLanguageDevelopperEntity association);

}
