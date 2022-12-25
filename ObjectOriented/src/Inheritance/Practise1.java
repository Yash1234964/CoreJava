package Inheritance;
import java.util.*;
class Loan{
	 int principal;
	 int rate;
	 int time;
	 
	 Loan(){
	 System.out.println("Enter all parameters");
	 Scanner sc=new Scanner (System.in);
	 System.out.println("Enter Principal");
	 principal=sc.nextInt();
	 System.out.println("Enter rate");
	 rate=sc.nextInt();
	 System.out.println("Enter Time");
	 time=sc.nextInt();
	 }
	 void displayParameters(){
		 System.out.println(principal);
		 System.out.println(rate);
		 System.out.println(time);
	 }
	 
}

class personal extends Loan{
	
	void displayInterest() {
		int SI=(principal * rate *time)/100;
		System.out.println("Your interest is "+SI);
	}
}

class education extends Loan{
	
	void displayInterest() {
		int SI=(principal * rate *time)/100;
		System.out.println("Your interest is "+SI);
		System.out.println("Study Nicely");
	}
}

class home extends Loan{
	
	void displayInterest() {
		int SI=(principal * rate *time)/100;
		System.out.println("Your interest is "+SI);
		System.out.println("Keep your house clean");
	}
}

class car extends Loan{
	
	void displayInterest() {
		int SI=(principal * rate *time)/100;
		System.out.println("Your interest is "+SI);
		System.out.println("Life insurance available");
	}
}





public class Practise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Loan p1=new Loan();
            p1.displayParameters();
            personal p2=new personal();
            p2.displayInterest();
            education p3=new education();
            p3.displayInterest();
            home p4=new home();
            p4.displayInterest();
            car p5=new car();
            p5.displayInterest();
	}

}
