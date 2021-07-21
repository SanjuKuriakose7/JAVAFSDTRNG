package com.ust;
/*
 * Inheritance
 */
//credit cards is a superclass

class Cards {
	String cardName; //instance variable
	 String expiryDate;
	 float creditBalance;
}
	
	class Visacards extends Cards {
		public void insert(String x, String y,float z) {
			cardName=x;
			expiryDate=y;
			creditBalance=z;
		}
		void disp() {
			System.out.println("Card Name:"+cardName+"\n Expiry Date:"+expiryDate+"\n Credit Balance:"+creditBalance);
		}
		public class CreditCards {
			public static void main(String[] args) {
				Visacards obj1=new Visacards();
				obj1.insert("visa", "08/26",8000);
				obj1.disp();
			}
		}
	}