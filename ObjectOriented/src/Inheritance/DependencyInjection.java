package Inheritance;

class Account{
	
	int ano;
	String aName;
	String aType;
	public Account(int ano, String aName, String aType) {
		super();
		this.ano = ano;
		this.aName = aName;
		this.aType = aType;
	}
	
	
	
}

class Employee{
	int eno;
	String eName;
	Account account;
	public Employee(int eno, String eName, Account account) {
		super();
		this.eno = eno;
		this.eName = eName;
		this.account = account;
	}
	void display() {
		System.out.println("Employee name is "+eName);
		System.out.println("Employee number is "+eno);
		System.out.println("==========================");
		System.out.println("Employee account number is "+account.ano);
		System.out.println("Employee account name is "+account.aName);
		System.out.println("Employee account type is "+account.aType);
	}
}
public class DependencyInjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Account account=new Account(1,"saving","recurring");
         Employee employee=new Employee(1,"Yash",account);
         employee.display();
	}

}
