package com.myjava;

public class Student {

	static String collegeName;
	String studentName;
	int studentId,studentMarks;
	
	static{
		System.out.println("static block called");
	}
	
	{
		System.out.println("Instance block called");
	}
	public static void display(int age) {
		System.out.println("Age is "+age);
	}
	
	public static void main(String[] args) {
          Student s = new Student();
          collegeName="aditya";
          s.studentName="Bhargav";
          s.studentId=3;
          s.studentMarks=80;
          System.out.println(collegeName);
          System.out.println(s.studentName);
          System.out.println(s.studentId);
          System.out.println(s.studentMarks);
          display(21);
	}

}
