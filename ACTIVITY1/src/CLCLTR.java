/**
 * @(#)CLCLTR.java
 *
 * CLCLTR application
 *
 * @author 
 * @version 1.00 2019/8/13
 */
 import java.util.Scanner;
public class CLCLTR {
    
    public static void main(String[] args) {
    	
    	// TODO, add your application code
    	System.out.println("Hello World!");
    	
    		int num1;
    		int num2;
    		int add;
    		int dif;
    		int prod;
    		int quot;
    		int res;
    		
    			Scanner input = new Scanner (System.in);
    			
    			System.out.print("Insert Number:");
    				num1 = input.nextInt();
    				
    			System.out.print("Insert Number:");
    				num2 = input.nextInt();
    				
    					
    		
    					   	 res = num1 + num2;
    							System.out.println("The result in Addition is"+ res);
    				
    						 res = num1 - num2;
    							System.out.println("The result in Difference is"+ res);
    				
    						 res = num1 / num2;
    							System.out.println("The result in Product is"+ res);
    				
    						 res = num1 * num2;
    							System.out.println("The result in Quotient is"+ res);
    	
    	
    	
    }
}
