package MapsDemo;

import java.util.*;
import java.util.Map.Entry;

class Passport{
	private String name;
	private int age;
	private String fatherName;
	private String city;
	public Passport(String name, int age, String fatherName, String city) {
		super();
		this.name = name;
		this.age = age;
		this.fatherName = fatherName;
		this.city = city;
	}
	@Override
	public String toString() {
		return name+" "+age+" "+fatherName+" "+city;
	}

	
}

public class PassportProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Passport p1=new Passport("Yash",22,"NKM","Godda");
	Passport p2=new Passport("Aditya",22,"ABC","Begusarai");
	Passport p3=new Passport("AMAN",22,"XYZ","Lucknow");
	
	
	HashMap mpp=new HashMap();
	
	mpp.put(1,p1);
	mpp.put(2, p2);
	mpp.put(3, p3);
	System.out.println(mpp);
	
	Set st=mpp.entrySet();
	Iterator it=st.iterator();
	
	while(it.hasNext()) {
		Map.Entry data=(Entry) it.next();
		System.out.println(data.getKey()+"--------------->"+data.getValue());
		
	}
	
	}

}
