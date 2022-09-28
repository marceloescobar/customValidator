package com.mescobar.customvalidator.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.mescobar.customvalidator.dto.InputWithGroups;

@Service
@Validated
public class ValidatingServiceWithGroups {

	@Validated(OnCreate.class)
	void validateForCreate(@Valid InputWithGroups input) {
		// do something
	}

	@Validated(OnUpdate.class)
	void validateForUpdate(@Valid InputWithGroups input) {
		// do something
	}
}
