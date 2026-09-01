package com.myjava;

class A{
	 B b;
}
class B{
	A a;
}

public class IslanofIsolation {

	public static void main(String[] args) {
    
		A o1= new A();
		B o2= new B();
		
		o1.b = o2;
		o2.a = o1;

		System.out.println(o1);
		System.out.println(o2);
		
		o1=null;
		o2=null;
		
		System.out.println(o1);
		System.out.println(o2);
		
	}

}
