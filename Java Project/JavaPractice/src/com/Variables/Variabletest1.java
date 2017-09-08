package com.Variables;

public class Variabletest1 {
	static int i=10; //GLOBAL VARIABLE
	static void test()
	{
		int j=15; //LOCAL VARIABLE
		System.out.println("j value is: "+j);
		System.out.println("i value is: "+i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
		int a=25; //LOCAL VARIABLE
		System.out.println("Main Method started");
		System.out.println("a value is: "+a);
		System.out.println("i value is: "+i);
		//System.out.println("j value is: "+j); //This will throw error.

	}

}
