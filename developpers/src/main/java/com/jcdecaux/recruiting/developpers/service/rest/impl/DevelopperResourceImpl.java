package com.jcdecaux.recruiting.developpers.service.rest.impl;

import java.util.List;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jcdecaux.recruiting.developpers.domain.model.DevelopperEntity;
import com.jcdecaux.recruiting.developpers.domain.service.DevelopperService;
import com.jcdecaux.recruiting.developpers.service.rest.DevelopperResource;

/**
 * 
 * @author GHRAB Saif Eddine
 *
 */

@Service
public class DevelopperResourceImpl implements DevelopperResource {

	@Autowired
	private DevelopperService service;
	
	/** La constante LOG. */
	private static final Logger LOG= Logger.getLogger(Class.class);

	@Override
	@Produces(MediaType.APPLICATION_JSON)
	public List<DevelopperEntity> getAllDeveloppers() {
		List<DevelopperEntity> allDeveloppers=service.getAllDeveloppers();
		LOG.info("Taille de la Liste des developpeurs : " + allDeveloppers.size());
		return allDeveloppers;
	}

	@Override
	public String getAllDeveloppersTest() {
		LOG.info("Liste des developpeurs convertie en String");
		StringBuilder result = new StringBuilder();
		for (DevelopperEntity dev : service.getAllDeveloppers()) {
			result.append(dev.getIdDevelopper()).append("   ").append(dev.getNomDevelopper()).append("   ").
			append(dev.getPosteDevelopper()).append("   ").append(dev.getAnneeExpDevelopper()).append("\n");
		}
		return result.toString();
	}

	@Override
	public void saveDevelopper(DevelopperEntity developper) {
		LOG.info("ADD / UPDATE du developpeur");
		service.saveDevelopper(developper);
	}



}
