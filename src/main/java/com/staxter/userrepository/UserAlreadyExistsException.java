package com.staxter.userrepository;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UserAlreadyExistsException extends Exception {

	public UserAlreadyExistsException() {
		super();
	}

	public UserAlreadyExistsException(String message) {
		super(message);
	}

}
