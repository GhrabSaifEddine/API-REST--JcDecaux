package com.jcdecaux.recruiting.developpers.service.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Service;

import com.jcdecaux.recruiting.developpers.domain.model.AssociationLanguageDevelopperEntity;
import com.jcdecaux.recruiting.developpers.domain.model.DevelopperEntity;
import com.jcdecaux.recruiting.developpers.domain.model.ProgrammingLanguageEntity;

/**
 * 
 * @author GHRAB Saif Eddine
 *
 */

@Path("/associations")
@Service
public interface AssociationLanguageDevelopperResource {

	@GET
	@Produces("application/json")
	public List<AssociationLanguageDevelopperEntity> getAllAssociations();
	
	@GET
	@Path("/developpersByLanguage/{idLanguage}")
    @Produces("application/json")
	public List<DevelopperEntity> getAllDeveloppersByLanguage(@PathParam("idLangage")int idLangage);
	
	@GET
	@Path("/LanguagesByDevelopper/{idDevelopper}")
	@Produces("application/json")
	public List<ProgrammingLanguageEntity>  getAllLanguagesByDevelopper(@PathParam("idDevelopper")int idDevelopper);
	
	
	@POST
	@Path("/saveAssociation")
	public void saveAssociation(AssociationLanguageDevelopperEntity association);

	
	

}
