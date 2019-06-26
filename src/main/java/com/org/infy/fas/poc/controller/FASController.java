package com.org.infy.fas.poc.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.org.infy.fas.poc.service.FASService;

/*******************************************************************************
 * Copyright (c) 2019 Infosys Ltd. All rights reserved.
 * 
 * Contributors: Samrat Basu. June 26, 2019
 * 
 * @param <T>
 ******************************************************************************/

@RestController
@RequestMapping(value = "/fas")
public class FASController {
	private final static Logger log = Logger.getLogger(FASController.class);
	@Autowired
	public FASService fasService; 
	
	@RequestMapping(value = "/getFASDataSet/{filterCriteria}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Object getFASDataSet(@PathVariable("filterCriteria") String filterCriteria) {
		log.debug("Inside fetchResultDataSet Controller");
		long starttime = System.currentTimeMillis();
			Object result = fasService.getFASDataSet(filterCriteria);
		long endtime = System.currentTimeMillis();
		log.debug("Total processing time " + (endtime - starttime) + " ms.");
		return result;
	}
}
