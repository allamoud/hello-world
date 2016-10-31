package Rashid;

import java.text.DecimalFormat;
import java.util.Scanner;

/*quadraticEquation.java
* Quadratic Equation
* Sept/30/16
* Aisha Rashid 
* This program displays the quadratic formulas.
*/
public class QuadraticEqaution {

	public void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c;

		Scanner scan =new Scanner(System.in);
		DecimalFormat df  = new DecimalFormat ("0.00");


		System.out.println("Enter Number");

		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();

		System.out.println(df.format(-1*b+(Math.sqrt(Math.pow(b,2)+(-4*(a*c)))/2*a)));

		System.out.println(df.format(-1*b-(Math.sqrt(Math.pow(b,2)+(-4*(a*c)))/2*a)));

		scan.close();
	}

}

