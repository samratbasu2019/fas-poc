package com.org.infy.fas.poc.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.org.infy.fas.poc.controller.FASController;

/*******************************************************************************
 * Copyright (c) 2019 Infosys Ltd. All rights reserved.
 * 
 * Contributors: Samrat Basu. June 26, 2019
 * 
 * @param <T>
 ******************************************************************************/

@Service
public class FASService {
	private final static Logger log = Logger.getLogger(FASService.class);
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("db-queries");
	EntityManager em = emf.createEntityManager();
	
	@SuppressWarnings("unchecked")
	public Object getFASDataSet(String fc) {	
		List<Object> PhraseList = null;
		if (fc.trim().equalsIgnoreCase("all"))
			PhraseList = em.createNamedQuery("getPhrase").getResultList();
		else
			PhraseList = em.createNamedQuery("getPhraseID").setParameter("documentId", fc).getResultList();

		return PhraseList;
	}
}
