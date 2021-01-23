package com.github.stokito.unitTestExample.calculator;

public class Calculator {

	public int sum(int a, int b) {
		return a + b;
	}
	public void sum (int a, int b) {
		System.out.println(a + b);
	}

	public int incrementBy4(int a) {
		return a + 4;
	}

	public int subtract(int a , int b) {
		return a - b ;
	}
	public int sum(float a, float b) {
		return (int) (a + b);
	}
}
