package com.jcdecaux.recruiting.developpers.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jcdecaux.recruiting.developpers.domain.model.AssociationLanguageDevelopperEntity;
import com.jcdecaux.recruiting.developpers.domain.model.DevelopperEntity;
import com.jcdecaux.recruiting.developpers.domain.model.ProgrammingLanguageEntity;

/**
 * 
 * @author GHRAB Saif Eddine
 *
 */
public interface AsoociationLanguageDevelopperRepository extends CrudRepository<AssociationLanguageDevelopperEntity, String>{
	
	@Query("From DevelopperEntity dev where  dev.idDevelopper in ( select   assoc.developper.idDevelopper from  AssociationLanguageDevelopperEntity assoc where assoc.programmingLanguage.idLanguage=:idLanguage)") 
	List<DevelopperEntity> getAllDeveloppersByLanguage(@Param("idLanguage") int idLanguage );
	
	@Query("From ProgrammingLanguageEntity lang where  lang.idLanguage in ( select   assoc.programmingLanguage.idLanguage from  AssociationLanguageDevelopperEntity assoc where assoc.developper.idDevelopper=:idDevelopper)") 
	List<ProgrammingLanguageEntity>getAllLanguagesByDevelopper(@Param("idDevelopper") int idDevelopper);

}
