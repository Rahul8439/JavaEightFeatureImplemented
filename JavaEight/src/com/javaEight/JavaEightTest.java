package com.javaEight;

public class JavaEightTest {

	public static void main(String[] args) {
		MathOperation addition=(int x, int y)-> x+y;
		MathOperation subtract=(int x, int y)-> x-y;
		MathOperation multiply=(int x, int y)-> {return x*y;};
		MathOperation divide=(x,y)->{return x/y;};
		int addResult=operate(5,15,addition);
		int subResult=operate(15,5,subtract);
		int multResult=operate(15,5,multiply);
		int divResult=operate(15,5,divide);
		System.out.println("Addition: "+addResult);
		System.out.println("Subtraction: "+subResult);
		System.out.println("Multiplication: "+multResult);
		System.out.println("Division: "+divResult);
	}
	
	interface MathOperation{
		int operation(int a,int b);
	}
	public static int operate(int num1, int num2, MathOperation mathOperation) {
		return mathOperation.operation(num1, num2);
	}
}
