package ExceptionPractice;

import java.util.Scanner;

class customException extends Exception {
	public customException(String msg) {
		super(msg);
	}
}

class Atm{
	
	String username="Yash";
	int password=1234;
	
	
	String uid;
	int pw;
	
	
	void enter() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username");
		uid=sc.nextLine();
		System.out.println("Enter Password");
		pw= sc.nextInt();
		
	}
	void verify() throws customException {
		if(uid.equals(username) && password==pw){
			System.out.println("You are elegible");
		}
		else {
			customException e=new customException("Wrong Credentials");
			System.out.println( e.getMessage());
			throw e;
		}
	}
	
	
}

public class nestedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atm a=new Atm();
		try {
			a.enter();
			a.verify();
		}
		catch(customException e1) {
			try {
				a.enter();
				a.verify();
			}
			catch(customException e2){
				System.out.println("No more try");
			}
		}

	}

}
