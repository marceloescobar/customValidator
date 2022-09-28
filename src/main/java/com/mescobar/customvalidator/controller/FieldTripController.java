package com.mescobar.customvalidator.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mescobar.customvalidator.dto.APIResponse;
import com.mescobar.customvalidator.dto.FieldTripForm;
import com.mescobar.customvalidator.service.FieldTripService;
import com.mescobar.customvalidator.validator.FieldTripFormValidator;

@RestController
@RequestMapping("/")
public class FieldTripController {

	@Autowired
    private FieldTripFormValidator ftfValidator;
	
    @Autowired
    private FieldTripService ftService;
    
    @InitBinder(value = "fieldTripForm")
    protected void initBinder(WebDataBinder binder) {
        binder.setValidator(ftfValidator);
    }
    
    @PostMapping(value = "/fieldtrip")
    public ResponseEntity<APIResponse> signUp(@Valid @RequestBody FieldTripForm ftf){
        APIResponse apiResponse = new APIResponse();
        //perform your logic here
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }
    
}
