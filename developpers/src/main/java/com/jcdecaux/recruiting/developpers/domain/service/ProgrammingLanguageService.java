package com.jcdecaux.recruiting.developpers.domain.service;
import java.util.List;

import com.jcdecaux.recruiting.developpers.domain.model.ProgrammingLanguageEntity;

/**
 * 
 * @author GHRAB Saif Eddine
 *
 */

public interface ProgrammingLanguageService {

	List<ProgrammingLanguageEntity> getProgrammingLanguages();
	
	void saveProgrammingLanguage(ProgrammingLanguageEntity programme);
	
}
