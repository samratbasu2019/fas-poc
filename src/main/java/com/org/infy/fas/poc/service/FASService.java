package com.org.infy.fas.poc.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.springframework.stereotype.Service;

/*******************************************************************************
 * Copyright (c) 2019 Infosys Ltd. All rights reserved.
 * 
 * Contributors: Samrat Basu. June 26, 2019
 * 
 * @param <T>
 ******************************************************************************/

@Service
public class FASService {
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
