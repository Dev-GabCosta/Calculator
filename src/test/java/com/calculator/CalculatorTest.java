package com.calculator;

import main.java.com.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
	Calculator calculator = new Calculator();

	@Test
	void testSuccessAdd(){
		double result = calculator.add(3, 8);
		Assertions.assertEquals(11, result);
	}

}