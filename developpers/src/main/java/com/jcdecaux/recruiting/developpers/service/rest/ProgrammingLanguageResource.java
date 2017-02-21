package com.jcdecaux.recruiting.developpers.service.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Service;

import com.jcdecaux.recruiting.developpers.domain.model.ProgrammingLanguageEntity;

/**
 * 
 * @author GHRAB Saif Eddine
 *
 */

@Path("/languages")
@Service
public interface ProgrammingLanguageResource {

	@GET
	@Produces("application/json")
	public List<ProgrammingLanguageEntity> getAllProgrammingLanguages();
	
	/*Récupére la liste des langages de programmation sous forme de string (TEST) */
	@GET
	public String getAllProgrammingLanguagesTest();
	
	@POST
	@Path("/saveLg")
	public void saveProgrammingLanguage(ProgrammingLanguageEntity language);
	

}
