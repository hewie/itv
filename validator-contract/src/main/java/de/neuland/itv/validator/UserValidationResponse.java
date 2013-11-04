package de.neuland.itv.validator;

public interface UserValidationResponse {
	
	boolean isValid();
	ErrorMessage getErrorMessage();

}
