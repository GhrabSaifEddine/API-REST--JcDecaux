package com.jcdecaux.recruiting.developpers.domain.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jcdecaux.recruiting.developpers.domain.model.ProgrammingLanguageEntity;
import com.jcdecaux.recruiting.developpers.domain.repository.ProgrammingLanguageRepository;
import com.jcdecaux.recruiting.developpers.domain.service.ProgrammingLanguageService;

/**
 * 
 * @author GHRAB Saif Eddine
 *
 */

@Component
public class ProgrammingLanguageServiceImpl implements ProgrammingLanguageService {

	@Autowired
	private ProgrammingLanguageRepository repository;
	
	
	@Override
	public List<ProgrammingLanguageEntity> getProgrammingLanguages() {
		List<ProgrammingLanguageEntity> allProgs= new ArrayList<ProgrammingLanguageEntity>();
		allProgs=(List<ProgrammingLanguageEntity>) repository.findAll();
		return  allProgs;
	}
	
	@Override
	public void saveProgrammingLanguage(ProgrammingLanguageEntity language) {
		repository.save(language);
	}

}
