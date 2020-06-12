package com.formation.customer.service;

import com.formation.customer.repository.ApiCalculatorRepository;

public class Calculator {
	
	private ApiCalculatorRepository apiCalculatorRepository;
	
	public Calculator() {
		apiCalculatorRepository = new ApiCalculatorRepository();
	}

	public static int add(int i, int j) {
		return i + j;
	}
	
	
	public  int addDBdata() {
	
		int x = apiCalculatorRepository.getX();
		int y = apiCalculatorRepository.getY();
		
		return x +y;
	}

	public static int subtract(int x, int y) {
		
		return x -y;
	}

	public static int multiply(int x, int y) {
		// TODO Auto-generated method stub
		return x * y;
	}


}
