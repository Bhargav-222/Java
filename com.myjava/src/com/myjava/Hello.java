package com.myjava;

public class Hello {
    public static void main(String[] args) throws ClassNotFoundException {
    	System.out.println("Hello");
    	
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	
    	System.out.println("Hi");
    }
}
 