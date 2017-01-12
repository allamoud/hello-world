package Rashid;

import java.util.Scanner;

public final class RemoveString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int index ;
		
		int index3;
String sentance1;

 String string3;
 
 System.out.println("Enter the sentance");
 sentance1 =scan.nextLine();
 System.out.println("Enter a string");
 
 string3 =scan.nextLine();
 
index =(sentance1.indexOf(string3));
 


 index3= (string3.length());
 
 
 System.out.println(sentance1.substring(0,index)+ sentance1.substring(index3+index));
 
	
	}

}
