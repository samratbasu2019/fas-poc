package com.org.infy.fas.poc.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*******************************************************************************
 * Copyright (c) 2019 Infosys Ltd. All rights reserved.
 * 
 * Contributors: Samrat Basu. June 26, 2019
 * 
 * @param <T>
 ******************************************************************************/
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({"com.org.infy.fas.poc"})
public class FASPocApplicationStarter {

	public static void main(String[] args) {
		SpringApplication.run(FASPocApplicationStarter.class, args);
	}

}
