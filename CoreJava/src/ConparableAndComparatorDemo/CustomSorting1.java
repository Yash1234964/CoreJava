package ConparableAndComparatorDemo;

import java.util.*;
import java.util.Collections;

class Movie1 implements Comparable<Movie1>{
	int mno;
	String name;
	int rating;
	public Movie1(int mno, String name, int rating) {
		super();
		this.mno = mno;
		this.name = name;
		this.rating = rating;
	}
	
	public int compareTo(Movie1 m1) {
		return this.mno-m1.mno;
	}
	
	@Override
	public String toString() {
		return mno+" "+name+" "+rating;
	}

	

//	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	
}
public class CustomSorting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Movie1 movie1=new Movie1(1,"Superman",4);
	     Movie1 movie2=new Movie1(2,"Batman",3);
	     Movie1 movie3=new Movie1(3,"Aquaman",2);
	     
	     ArrayList<Movie1> arr=new ArrayList<Movie1>();
	     arr.add(movie1);
	     arr.add(movie2);
	     arr.add(movie3);
	     MnoCompare comp= new MnoCompare();
	     Collections.sort(arr);
	     
	     System.out.println(arr);
	}

}
