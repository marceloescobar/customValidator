package com.mescobar.customvalidator.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

import com.mescobar.customvalidator.service.OnCreate;
import com.mescobar.customvalidator.service.OnUpdate;

public class InputWithGroups {

	@Null(groups = OnCreate.class)
	@NotNull(groups = OnUpdate.class)
	private Long id;
}
