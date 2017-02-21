package com.jcdecaux.recruiting.developpers.domain.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.jcdecaux.recruiting.developpers.domain.model.DevelopperEntity;

/**
 * 
 * @author GHRAB Saif Eddine
 *
 */
public interface DevelopperRepository extends CrudRepository<DevelopperEntity, String>{

	
	//Récupérer le nom du developpeur
	@Query("SELECT d.nomDevelopper FROM DevelopperEntity d")
	String getNomDevelopper();
}
