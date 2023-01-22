package FileHandeling;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class Practice1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url="E:\\JAVA course";
		File f= new File(url);
		
		File f1= new File(f,"File1");
		File f2= new File(f,"Directory");
		f2.mkdir();
		
		System.out.println(f.exists());
		f1.createNewFile();
		
		System.out.println(f.exists());
		String names[] =f.list();
		System.out.println(names.length);
		for(String name:names)
			System.out.println(name);
	     
		
		File fa= new File(f2,"abc");
		fa.createNewFile();
		// Write Opearation
		
		FileWriter fw1=new FileWriter(f1);
		fw1.write(73);
		fw1.write("neuron\nTechnology\nPrivate\nLimited");
		fw1.write("\n");
		char ch[] ={'a','b','c'};
		fw1.write(ch);
		fw1.flush();
		fw1.close();
		
		// Read Operation
		
		FileReader fr=new FileReader(f1);
		int i=fr.read();
		while(i!=-1)
		{
			System.out.println((char)i);
			i=fr.read();
		}
		
		
		
	}

}





















