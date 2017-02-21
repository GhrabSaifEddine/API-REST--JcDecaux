package com.jcdecaux.recruiting.developpers.domain.service;
import java.util.List;

import com.jcdecaux.recruiting.developpers.domain.model.DevelopperEntity;

/**
 * 
 * @author GHRAB Saif Eddine
 *
 */

public interface DevelopperService {

	List<DevelopperEntity> getAllDeveloppers();
	
	void saveDevelopper(DevelopperEntity developper);
	
}
