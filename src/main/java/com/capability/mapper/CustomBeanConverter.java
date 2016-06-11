package com.capability.mapper;

import javax.annotation.PostConstruct;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * @author dsomajohassula
 * 
 * The Class CustomBeanConverter.
 *
 * @author dsomajohassula
 * 
 * The Class CustomBeanConverter.
 */
@Component
public class CustomBeanConverter extends DozerBeanMapper {
	
	/** The custom bean mapping builder. */
	@Autowired
	private CustomBeanMappingBuilder customBeanMappingBuilder;

	/**
	 * Inits the.
	 */
	@PostConstruct
	public void init() {
		this.addMapping(customBeanMappingBuilder);
	}
}
