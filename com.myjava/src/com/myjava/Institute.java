package com.myjava;

public class Institute {
	
	static String TrainerName1,TrainerName2;
	String EmployeeName,EmployeeDesignation;
	int EmployeeId;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Institute o = new Institute();
		Institute o1 = new Institute();
		Institute o2 = new Institute();
		Institute o3 = new Institute();
		Institute o4 = new Institute();
		
        o.EmployeeName="Kiran";
        o.EmployeeDesignation="Manager";
        o.EmployeeId=101;
        
        o1.EmployeeName="Ravi";
        o1.EmployeeDesignation="Hr";
        o1.EmployeeId=111;
        
        o2.EmployeeName="Anand";
        o2.EmployeeDesignation="Manager";
        o2.EmployeeId=121;
        
        o3.EmployeeName="Tharun";
        o3.EmployeeDesignation="Manager";
        o3.EmployeeId=124;
        
        o4.EmployeeName="Ganesh";
        o4.EmployeeDesignation="Manager";
        o4.EmployeeId=144;        
        TrainerName1="Rahul";
        TrainerName2="Naresh";
        System.out.println("________________________________");
        System.out.println("Trainer Name: "+TrainerName1);
        System.out.println("________________________________");
        System.out.println("Employee Name: "+o.EmployeeName);
        System.out.println("Employee Designation: "+o.EmployeeDesignation);
        System.out.println("Employee Id: "+o.EmployeeId);
        System.out.println(" ");
        System.out.println("Employee Name: "+o1.EmployeeName);
        System.out.println("Employee Designation: "+o1.EmployeeDesignation);
        System.out.println("Employee Id: "+o1.EmployeeId);
        System.out.println(" ");
        System.out.println("Employee Name: "+o2.EmployeeName);
        System.out.println("Employee Designation: "+o2.EmployeeDesignation);
        System.out.println("Employee Id: "+o2.EmployeeId);
        System.out.println("________________________________");
        System.out.println("Trainer Name: "+TrainerName2);
        System.out.println("________________________________");
        System.out.println("Employee Name: "+o3.EmployeeName);
        System.out.println("Employee Designati3n: "+o3.EmployeeDesignation);
        System.out.println("Employee Id: "+o3.EmployeeId);
        System.out.println(" ");
        System.out.println("Employee Name: "+o4.EmployeeName);
        System.out.println("Employee Designation: "+o4.EmployeeDesignation);
        System.out.println("Employee Id: "+o4.EmployeeId);
	}

}
