package com.mescobar.customvalidator.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

import com.mescobar.customvalidator.service.OnCreate;
import com.mescobar.customvalidator.service.OnUpdate;
import com.mescobar.customvalidator.validator.IpAddress;

public class InputWithCustomValidator {

	  @IpAddress
	  private String ipAddress;
	  
	  @Id
	  @GeneratedValue
	  @NotNull(groups = OnUpdate.class)
	  @Null(groups = OnCreate.class)
	  private Long id;

	
}
