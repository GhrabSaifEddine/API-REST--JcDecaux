package com.jcdecaux.recruiting.developpers.domain.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jcdecaux.recruiting.developpers.domain.model.DevelopperEntity;
import com.jcdecaux.recruiting.developpers.domain.repository.DevelopperRepository;
import com.jcdecaux.recruiting.developpers.domain.service.DevelopperService;

/**
 * 
 * @author GHRAB Saif Eddine
 *
 */

@Component
public class DevelopperServiceImpl implements DevelopperService {

	@Autowired
	private DevelopperRepository repository;
	
	
	@Override
	public List<DevelopperEntity> getAllDeveloppers() {
		List<DevelopperEntity> allDev= new ArrayList<DevelopperEntity>();
		allDev=(List<DevelopperEntity>) repository.findAll();
		return  allDev;
	}

	@Override
	public void saveDevelopper(DevelopperEntity developper) {
		repository.save(developper);		
	}


}
