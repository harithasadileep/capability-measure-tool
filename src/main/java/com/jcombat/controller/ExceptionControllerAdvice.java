package com.jcombat.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.capability.raml.model.ExceptionMessage;
import com.capability.raml.model.ExceptionObject;
import com.capability.raml.model.ExceptionObject.HttpCode;
import com.capability.raml.resource.CapabilityMeasureResource.PostCapabilityMeasureClusterResponse;

@ControllerAdvice
public class ExceptionControllerAdvice {

	@ExceptionHandler(Exception.class)
	public PostCapabilityMeasureClusterResponse exceptionHandler(Exception ex) {
		/*ErrorResponse error = new ErrorResponse();
		error.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		error.setMessage("Please contact your administrator");*/
		ExceptionMessage exMessage = new ExceptionMessage();
		ExceptionObject obj = new ExceptionObject();
		obj.setHttpCode(HttpCode._404);
		obj.setMessage("Record Not Found with given criteria : clusterId- , mapName- sectorName- ");
		exMessage.setExceptionObject(obj);
		return  PostCapabilityMeasureClusterResponse.withJsonNotFound(exMessage);
	}
}