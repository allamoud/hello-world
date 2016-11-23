package sup;

import java.util.Scanner;

public class dice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ClassName.java
 * Nov/22/16
 * Dice2 
 * Aisha Rashid 
 */
	
Scanner scan=new Scanner (System.in);
		
		int dice1;
		int dice2; 
		int yes;
	do{	
		
		
		dice1 =(int)(Math.random()*11)+1;
		
        dice2 =(int)(Math.random()*11)+1;
        yes= scan.nextInt();
         if (dice1>dice2)
        	
        	System.out.println("You Won");
         System.out.println("Type 2 you want to play again?");
         yes= scan.nextInt();
          if (dice1<dice2)
        	 
        	 System.out.println("You Lost");
         
        	
         else if (dice1==dice2)
        	 
        	System.out.println("It was a tie");
       System.out.println("Type 2 if you want to play again");
       yes= scan.nextInt();
	}while (yes==1);

	}
}



