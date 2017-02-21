package com.jcdecaux.recruiting.developpers.service.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Service;

import com.jcdecaux.recruiting.developpers.domain.model.DevelopperEntity;

/**
 * 
 * @author GHRAB Saif Eddine
 *
 */

@Path("/developpers")
@Service
public interface DevelopperResource {

	@GET
	@Produces("application/json")
	public List<DevelopperEntity> getAllDeveloppers();
	
	/*Récupére la liste de développeurs sous forme de string (TEST)  */
	@GET
	public String getAllDeveloppersTest();
	
	@POST
	@Path("/saveDev")
	public void saveDevelopper(DevelopperEntity developper);
	

}
