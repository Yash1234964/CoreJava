package StreamApiPractice;
import java.io.*;

@FunctionalInterface
interface  Solve{
	public void m1(String s,int i);
}

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               Solve i=(s,j)->{System.out.println(s+j);
                              System.out.println(j*2);};
               
               i.m1("Yash",23);
	}

}
