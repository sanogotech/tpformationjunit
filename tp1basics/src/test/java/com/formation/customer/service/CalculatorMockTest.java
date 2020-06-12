package com.formation.customer.service;




import static org.mockito.ArgumentMatchers.any;

//BDD
import static org.mockito.BDDMockito.*;
//Mockito
import static org.mockito.Mockito.when;

import java.util.Optional;

import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;
import org.mockito.Mock;
import org.mockito.InjectMocks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;



import org.mockito.junit.jupiter.MockitoExtension;

import com.formation.customer.repository.ApiCalculatorRepository;

@ExtendWith(MockitoExtension.class)
public class CalculatorMockTest {
	
	@Mock
	ApiCalculatorRepository apiCalculatorRepository;
	
	@InjectMocks
	Calculator  calculator;
	
	
	@Test
	public void testAddDBData() {
		//Given
		//Init Data
		//BDD
		//given(apiCalculatorRepository.getX()).willReturn(18);
		//given(apiCalculatorRepository.getY()).willReturn(27);
		
		
		//When Call Mock
		 when(apiCalculatorRepository.getX()).thenReturn(18);
		 when(apiCalculatorRepository.getY()).thenReturn(27);
		 //doReturn(27).when(apiCalculatorRepository).getY();
	
		//When call service
		int resultActual = calculator.addDBdata();
		
		//Then  Verify
		verify(apiCalculatorRepository, atLeast(1)).getX();
		//Then  Assertions
		Assertions.assertEquals(45,resultActual , "18 + 27 should equal 45");
	}
	
	

}
