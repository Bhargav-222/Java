package com.myjava;

public class Objectcount {
	
	static int count;
	
   @Override
protected void finalize() throws Throwable {
     System.out.println("Final called");
}
	
	
	{
		count++;
	}
	
	void greet() {
		System.out.println("Hello Bhargav");
		Objectcount o4 = new Objectcount(); 
		}
  
	public static void main(String[] args) {
		
		Objectcount o1 =  new Objectcount();
		Objectcount o2 =  new Objectcount();
		Objectcount o3 =  new Objectcount();
		new Objectcount().greet();
		
	    System.out.println(count);
	    
	    System.out.println(o1);
	    System.out.println(o2);
	    System.out.println(o3);
	    
	    o1 = null;
	    
	    o2=o3;
	    
	    o3 = null;
	    
	    System.gc();
      
	}

}
