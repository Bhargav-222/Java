package com.myjava;

public class Test {

	
  	static void method1() {
  		method2();
		System.out.println("Method 1 Called");
	}
  	static void method2() {
  		method3();
		System.out.println("Method 2 Called");
	}
  	static void method3() {
		System.out.println("Method 3 Called");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method Started");
	    method1();
		System.out.println("Main method is ended");
  
	}

}
