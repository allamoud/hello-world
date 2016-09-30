package sup;
import java.util.Scanner;
/*ClassName.Java
 * ArithmeticExpressions
 * Sept/26/16
 * Aisha Rashid 
 */
 
public class ArithmeticExpressions {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

       Scanner scan=new Scanner(System.in);
       
       int num1, num2, num3, num4, num5;
      
       
       System.out.format("Please type in five numbers");
       
      
        num1=scan.nextInt();
        num2=scan.nextInt();
        num3=scan.nextInt();
        num4=scan.nextInt();
        num5=scan.nextInt();
          
          System.out.println("your amount is:"+ (num1+num2+num3+num4+num5));  
          System.out.println("The result after subtracting the the second number from the third is " + (num2-num3));
          System.out.println("The product of the frist and the fifth is "+ (num1*num5));
          System.out.println("The quotient of the fourth number divided by the second is"+ (num4/num2));
          System.out.println("The remainder when dividing the fourth number by the second is"+(num4%num2));
          System.out.println("The first number raised to the power of the third number is" + Math.pow(num1,num3));
          System.out.println("The square root of the fifth number is" + Math.sqrt(num5));
          
          
	}
	
	
	    
}
