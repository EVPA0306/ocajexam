package com.evpa.ocajexam.exercises.chapterfive;

public class MathTools {

	public static void main(String[] args) throws Exception {
		MathTools mt = new MathTools();
		System.out.println(mt.findLowerValue(5.3323D,5.239894738748D));
		int value = 1;
		System.out.println("Value before method's call " + value);
		mt.addTwo(value);
		System.out.println("Value after method's call " + value);

		Number valueObject = new Number(1);
		System.out.println("Value of Object before method's call " + valueObject + " == " + valueObject.getNumber());
		mt.addThree(valueObject);
		System.out.println("Value of Object after method's call " + valueObject + " == " + valueObject.getNumber());
	}

	public void addTwo(int value) {
		System.out.println("Parameter: value = " + value);
		value = value + 2;
		System.out.println("Leaving method: value = " + value);
	}

	public void addThree(Number value) {
		System.out.println("Parameter: value = " + value.getNumber());
		value.setNumber(value.getNumber() + 3);
		System.out.println("Leaving method: value = " + value.getNumber());
	}

	public int findLowerValue(int oneParam, int twoParam) throws ArithmeticException {
		int result;
		if ( oneParam < twoParam) 
			result = oneParam;
		else 
			result = twoParam;
		return result;
	}


	public float findLowerValue(float oneParam, float twoParam) throws ArithmeticException {
		float result;
		if ( oneParam < twoParam) 
			result = oneParam;
		else 
			result = twoParam;
		return result;
	}

		public double findLowerValue(double oneParam, double twoParam) throws ArithmeticException, ClassCastException{
		double result;
		if ( oneParam < twoParam) 
			result = oneParam;
		else 
			result = twoParam;
		return result;
	}
}