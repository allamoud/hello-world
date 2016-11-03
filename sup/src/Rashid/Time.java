import java.text.DecimalFormat;
import java.util.Scanner;


   /*ClassName.java
        *Time 
        * oct/11/16
        * Aisha Rashid
        */
package Rashid;
public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner scan=new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		
		double design;
		double coding;
		double debugging;
		double testing;
		
		System.out.println("Enter the amount spent on design");
		design =scan.nextDouble();
		
		System.out.println("Enter the amount spent coding");
		coding =scan.nextDouble();
		
		System.out.println("Enter the amount spent debugging");
		debugging =scan.nextDouble();
		
		System.out.println("Enter the amount spent on testing");
		testing =scan.nextDouble();
		  
		System.out.format("%10s%10s","Task","%Time");
		
		System.out.format("Desiging" + df.format((design/design+coding+debugging+testing)*100));
		
		
		System.out.format("Coding" + df.format((coding/design+coding+debugging+testing)*100));
		
		
		System.out.format("debugging"+ df.format((debugging/design+coding+debugging+testing)*100));
		
		scan.close();
	}

}
