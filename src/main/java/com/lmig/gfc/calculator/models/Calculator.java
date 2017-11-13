package com.lmig.gfc.calculator.models;

public class Calculator {

	private double result;

	public void add(int firstNumber, int secondNumber) {
		result = firstNumber + secondNumber;
	}

	public void subtract(int firstNumber, int secondNumber) {
		result = firstNumber - secondNumber;
	}

	public void multiply(int firstNumber, int secondNumber) {
		result = firstNumber * secondNumber;
	}

	public void divide(int firstNumber, int secondNumber) {
		result = firstNumber / secondNumber;
	}

	public void exponent(int firstNumber, int secondNumber) {
		result = Math.pow(firstNumber, secondNumber);
	}

	public double getResult() {
		return result;
	}

}
