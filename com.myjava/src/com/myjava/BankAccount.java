package com.myjava;

public class BankAccount {
	
	long Accno;
	String accountHolderName;
	double balance;
	static long accountNogenerator=32567835;
	
	{
		accountNogenerator+=1;
		Accno=accountNogenerator;
	}

	public static void main(String[] args) {
		
		BankAccount b1 = new BankAccount();
		BankAccount b2 = new BankAccount();

		
		b1.accountHolderName="Bhargav";
		b1.balance=25000;
		
		b2.accountHolderName="Venkat";
		b2.balance=30000;
		
		System.out.println("Account Number :"+ b1.Accno+"\n"+"Account Holder Name : "+b1.accountHolderName+"\n"+"Balance : "+b1.balance+"\n");
		
		System.out.println("Account Number :"+ b2.Accno+"\n"+"Account Holder Name : "+b2.accountHolderName+"\n"+"Balance : "+b2.balance);

	}

}
