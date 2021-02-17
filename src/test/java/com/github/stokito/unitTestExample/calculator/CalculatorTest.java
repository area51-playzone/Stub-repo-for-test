package com.github.stokito.unitTestExample.calculator;

import junit.framework.Assert;
import org.junit.Test;

public class CalculatorTest {
	@Test
	@Override
	@MyCustomAnnotation(
    	testName="testSumAgain",
    	startline="13"
	)
	public void testSumagain()  throws ArithmeticException, ArrayIndexOutOfBoundsExceptionthrows {
		// Given
		// testing annotations
		Calculator calculator = new Calculator();
		// When
		int result = calculator.sum(2, 2);
		int iby4 = calculator.incrementBy4(result);
		// Then
		Assert.assertTrue(result == 4);
		Assert.assertEquals(8, iby4);
	}

}
