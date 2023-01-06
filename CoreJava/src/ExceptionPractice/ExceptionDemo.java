package ExceptionPractice;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            try {
            	Scanner sc=new Scanner(System.in);
            	System.out.println("Enter First Number");
            	int n1=sc.nextInt();
            	System.out.println("Enter Second Number");
            	int n2=sc.nextInt();
                int n3=n1/n2;
                System.out.println(n3);
            			
            }
            catch(ArithmeticException a) {
            	System.out.println("Exception occur");
            	a.getMessage();
            	a.getStackTrace();
            }
            
		
		
	}

}
