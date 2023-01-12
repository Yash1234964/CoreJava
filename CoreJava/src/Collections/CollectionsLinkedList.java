package Collections;

import java.util.*;

public class CollectionsLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList arr=new LinkedList();
	      arr.add(10);
	      arr.add(20);
	      arr.add(30);
	      arr.add(40);
	      System.out.println(arr);
	      arr.add(2,10);
	      System.out.println(arr);
	      System.out.println(arr.get(4));
	      System.out.println(arr.getFirst());
	      
	      Iterator it= arr.iterator();
            
	      while(it.hasNext()==true) {
	    	  System.out.println(it.next());
	      }
	      ListIterator it1= arr.listIterator(arr.size());
          
	      while(it1.hasPrevious()==true) {
	    	  System.out.print(it1.previous()+" ");
	      }
	System.out.println();
	
	Iterator it3=arr.descendingIterator();
	while(it3.hasNext()==true)
		System.out.print(it3.next()+" ");

}
}
