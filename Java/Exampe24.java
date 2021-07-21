package com.ust;

class Bank {
	private int accountNo;
	private String accountName;
	private float accountBalance;
	
	void printBankdetails() {
		System.out.println(accountNo+"\n"+accountName+"\n"+accountBalance);
		}
	
	void insertBankData(int x,String y,float z) {
		accountNo=x;
		accountName=y;
		accountBalance=z;
	}
		
	}
	
	class Example24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank e1=new Bank();
		e1.insertBankData(12345,"Sanju",8000.0f);
		e1.printBankdetails();
		

	}

}
