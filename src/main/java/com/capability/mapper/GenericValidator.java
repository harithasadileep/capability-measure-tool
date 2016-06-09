/**
 * @author hitjoshi
 * @created Dec 15, 2015
 */
package com.capability.mapper;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

/**
 * @author dsomajohassula
 * 
 *  Generic class to capture JSR-303 Validations Violations and
 *         return a Map of violations in the incoming Bean.
 */
@Component
public class GenericValidator {
	
	/**
	 * Validate.
	 *
	 * @param <T> the generic type
	 * @param srcObj the src obj
	 * @param classType the class type
	 * @return the map
	 */
	public static <T> Map<String, String> validate(T srcObj, final Class<T> classType) {
		Map<String, String> errorMessageMap = null;
		Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
		Set<ConstraintViolation<T>> violations = validator.validate(srcObj);
		if (!violations.isEmpty()) {
			errorMessageMap = new HashMap<String, String>();
			for (ConstraintViolation<T> violation : violations) {
				errorMessageMap.put(violation.getPropertyPath().toString(), violation.getMessage());
			}
		}
		return errorMessageMap;
	}
}
