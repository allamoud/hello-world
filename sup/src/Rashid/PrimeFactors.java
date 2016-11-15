package Rashid;
import java.util.Scanner;
 /*PrimeFactors
  * Every positive integer is the product of a set of prime numbers 
  * Nov/14/16
  * Aisha Rashid 
  */
 
public class PrimeFactors {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan =new Scanner(System.in);
	


	
	System.out.print("Enter your number");
	
	int userInput=scan.nextInt();
	int counter=2;
	
	
	while (userInput <=counter)
		
	{
	
		 userInput=scan.nextInt();
	
	}
	if (userInput%counter == 0)
	{
System.out.println(counter+(counter/userInput));



	}
	else 
	{
	 System.out.println(counter= counter + 1); 
	}
	
}

   
}
	