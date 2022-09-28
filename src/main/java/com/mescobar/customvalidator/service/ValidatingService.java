package com.mescobar.customvalidator.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.mescobar.customvalidator.dto.Input;


@Validated
public class ValidatingService {

	
	public void validateInput(@Valid Input input) {
		// do something
	}

}
