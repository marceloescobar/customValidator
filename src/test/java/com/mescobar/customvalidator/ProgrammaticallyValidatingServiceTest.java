package com.mescobar.customvalidator;

import static org.junit.jupiter.api.Assertions.assertThrows;

import javax.validation.ConstraintViolationException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.mescobar.customvalidator.dto.Input;
import com.mescobar.customvalidator.service.ProgrammaticallyValidatingService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ProgrammaticallyValidatingServiceTest {

	@Autowired
	  private ProgrammaticallyValidatingService service;

	  @Test
	  void whenInputIsInvalid_thenThrowsException(){
	    Input input = invalidInput();

	    assertThrows(ConstraintViolationException.class, () -> {
	      service.validateInput(input);
	    });
	  }

	  @Test
	  void givenInjectedValidator_whenInputIsInvalid_thenThrowsException(){
	    Input input = invalidInput();

	    assertThrows(ConstraintViolationException.class, () -> {
	      service.validateInputWithInjectedValidator(input);
	    });
	  }
	  
	  private Input invalidInput() {
		  return new Input();
	  }
}
