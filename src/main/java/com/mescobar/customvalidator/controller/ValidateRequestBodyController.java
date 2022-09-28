package com.mescobar.customvalidator.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mescobar.customvalidator.dto.Input;

@RestController
public class ValidateRequestBodyController {

	@PostMapping("/validateBody")
	  ResponseEntity<String> validateBody(@Valid @RequestBody Input input) {
	    return ResponseEntity.ok("valid");
	  }
}
