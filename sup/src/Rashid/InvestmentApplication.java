package Rashid;

import java.util.Scanner;

public class InvestmentApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*ClassName.java
 * Nov/22/16
 * InvestmentApplication
 * Aisha Rashid 
 */
		Scanner scan=new Scanner (System.in);
		
		int year = 1;
		double money = 2500;
		
		while (money <= 5000){
			money = money * 1.075 ;
			
			year = year +1;
			
		}
		System.out.println("It would tell you "+ (int) year +" year ");
	

	}
}
