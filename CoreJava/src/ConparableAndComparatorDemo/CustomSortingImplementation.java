package ConparableAndComparatorDemo;

import java.util.*;
class Movie{
	int mno;
	String name;
	int rating;
	public Movie(int mno, String name, int rating) {
		super();
		this.mno = mno;
		this.name = name;
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return mno+" "+name+" "+rating;
	}
	
}

class MnoCompare implements Comparator<Movie>{
	
	@Override
	public int compare(Movie m1,Movie m2) {
		if(m1.mno > m2.mno) return -1;
		if(m1.mno < m2.mno) return 1;
		else return 0;
		
	}

	

//	@Override
//	public int compare(Object o1, Object o2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	
	
	 
}

public class CustomSortingImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
	     Movie movie1=new Movie(1,"Superman",4);
	     Movie movie2=new Movie(2,"Batman",3);
	     Movie movie3=new Movie(3,"Aquaman",2);
	     
	     ArrayList<Movie> arr=new ArrayList<Movie>();
	     arr.add(movie1);
	     arr.add(movie2);
	     arr.add(movie3);
	     MnoCompare comp= new MnoCompare();
	     Collections.sort(arr,comp);
	     
	     System.out.println(arr);
	     
	    		 
	}

}
