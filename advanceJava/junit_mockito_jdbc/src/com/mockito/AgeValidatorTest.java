package com.mockito;


import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AgeValidatorTest {
	@Mock
	Database db;
	
	@InjectMocks
	AgeValidator validator;
	
	@Test
	void testInvalidAge() {
		assertThrows(IllegalArgumentException.class,()->validator.validateAge(-1));
	}

}
