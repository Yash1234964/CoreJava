package Collections;

import java.util.Collections;
import java.util.PriorityQueue;

import java.util.*;

public class CollectionsHeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue pq1=new PriorityQueue();
		PriorityQueue pq2=new PriorityQueue(Collections.reverseOrder());
		
		pq1.add(5);
		pq1.add(25);
		pq1.add(11);
		pq1.add(78);
		pq1.add(19);
		pq1.add(6);
		pq1.add(4);
		
		pq2.add(5);
		pq2.add(25);
		pq2.add(11);
		pq2.add(78);
		pq2.add(19);
		pq2.add(6);
		pq2.add(4);
		
		
		System.out.println(pq1);
		System.out.println(pq2);
		
		System.out.println(pq1.peek());
		System.out.println(pq2.peek());
		
		Iterator it= pq1.iterator();
		
		while(it.hasNext()==true) {
			System.out.println(it.next());
		}
			
	}

}
