package Implementation;

import java.util.Scanner;

interface IAccount{
	void deposit();
	void withdraw();
	void display();
}

abstract class BankImpl implements IAccount{
	
 String name;
 int amount;
 
 
public BankImpl(String name, int amount) {
	super();
	this.name = name;
	this.amount = amount;
}


@Override
public void display() {
	// TODO Auto-generated method stub
         System.out.println("Name of account holder is "+name);
         System.out.println("Amount in account "+amount);
	
}
}

 class Account extends BankImpl{
	
	int withdrawAmount;
    int depositAmount;
	public Account(String name, int amount, int withdrawAmount,int depositAmount) {
		super(name, amount);
		this.withdrawAmount = withdrawAmount;
		this.depositAmount=depositAmount;
	}
	Scanner sc= new Scanner(System.in);
	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Enter amount to be deposited ");
		
		depositAmount=sc.nextInt();
		amount+=depositAmount;
		System.out.println("Total Amount "+amount);
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Enter amount to withdraw ");
		withdrawAmount=sc.nextInt();
		
		if(withdrawAmount > amount)
			System.out.println("Insufficient Amount");
		else
			System.out.println("Remaining Amount "+amount);
		
	}
	
}



public class InterfaceProject {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IAccount account=new Account("Pintu",1000,0,0);
         account.display();
         account.deposit();
         account.withdraw();
         account.display();
	}

}

























