package sup;

import java.util.Scanner;

public class dice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner (System.in);
		
		int dice1;
		int dice2; 
		
		
		dice1 =(int)(Math.random()*11)+1;
		
        dice2 =(int)(Math.random()*11)+1;
        
         if (dice1>dice2)
        	
        	System.out.println("You Won");
         
         else if (dice1<dice2)
        	 
        	 System.out.println("You Lost");
         
        	
         else if (dice1==dice2)
        	 
        	System.out.println("It was a tie");
       

	}



	}


