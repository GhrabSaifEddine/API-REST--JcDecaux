package com.jcdecaux.recruiting.developpers.domain.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.jcdecaux.recruiting.developpers.domain.model.ProgrammingLanguageEntity;

/**
 * 
 * @author GHRAB Saif Eddine
 *
 */
public interface ProgrammingLanguageRepository extends CrudRepository<ProgrammingLanguageEntity, String>{

	//Récupérer le libelle du lanaguage
	@Query("SELECT i.libelleLanguage FROM ProgrammingLanguageEntity i")
	String getLibelleLanguage();
}
