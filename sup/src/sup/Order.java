package sup;
/*Food.java

 *Shows and calculates the total, before tax, and change

 *September/10/16

 *Rashid Aisha

 */
import java.text.DecimalFormat;

import java.util.Scanner;
public class Order {
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);

				DecimalFormat df = new DecimalFormat ("0.00");

				

				double burger;

				double fries;

				double soda;

				double tax;

				double beforeTax;

				double total;

				double amountTendered;

				

				System.out.print("Enter the number of burgers: " );

				burger=scan.nextDouble() * 1.69;

				

				System.out.print("Enter the number of fries: " );

				fries=scan.nextDouble() * 1.09;

				

				System.out.print("Enter The number of sodas: ");

				soda=scan.nextDouble() * 0.99;

				

				System.out.println("Total before tax: $" + (df.format(burger+fries+soda)));

				beforeTax=burger+fries+soda;

				

				System.out.println("Tax: $" +(df.format (beforeTax * 0.065)));

				tax=beforeTax * 0.065;

				

				System.out.println("Total with tax: $" +(df.format (beforeTax+tax)));

				total=tax+beforeTax;

				

				System.out.print("Enter amount tendered:");

				amountTendered=scan.nextDouble();

				

				System.out.println("Change: $" + (df.format(amountTendered - total)));

				scan.close();

			}




		
	

}
