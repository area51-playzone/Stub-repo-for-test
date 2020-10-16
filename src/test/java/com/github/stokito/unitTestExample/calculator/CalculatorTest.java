package com.github.stokito.unitTestExample.calculator;

import junit.framework.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAddition() {
		// Given
		Calculator calculator = new Calculator();
		// When
		int result = calculator.doAddition(2, 2);
		// Then
		Assert.assertTrue(result == 4);
	}
}
