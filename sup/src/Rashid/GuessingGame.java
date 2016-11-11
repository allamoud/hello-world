package Rashid;
import java.util.Scanner;

/*Displays decimals and hexa decimals 
 * Sept/11/16
 * Aisha Rashid 
 */



public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		
		int y; int x;
		
		System.out.println("Enter a number between 1 and 20 ");
		
		x=scan.nextInt();
		
		y =(int)(Math.random()*20)+1;
		if (x==y)
			System.out.println("You won");
		else if  (x<y)
		System.out.println("you lose");
		else if (x>y)
			System.out.println("you lose");
		System.out .println("Computer's Number:"+ y);
		System.out.println("Player's Number:" + x);
				
	}

}
