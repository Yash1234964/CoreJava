package SerializationAndDeserializationDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable{
	int a=10;
	int b=20;
	
}
class Cat implements Serializable{
	int a=100;
	int b=200;
	
}


public class Test1 {

	public static void main(String[] args) throws 
	IOException,ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Dog d=new Dog();
		
		System.out.println("serialization started");
		String fileName="abc.ser";
		FileOutputStream fos=new FileOutputStream(fileName);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		System.out.println(d);
		System.out.println("Serialization Ended");
		
		System.in.read();
		System.out.println("De-Serialization started.....");
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj=ois.readObject();
		Dog d1 = (Dog)obj;
		System.out.println("De-Serialized Object refernce is ::"+d1);
		System.out.println("De-Serialization ended.....");
		
		

	}

}
