package Collections;
import java.util.*;
import java.util.LinkedHashSet;
public class HST {
	
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			HashSet st1=new HashSet();
			LinkedHashSet st2= new LinkedHashSet();
			
			st1.add(5);
			st1.add(25);
			st1.add(11);
			st1.add(78);
			st1.add(19);
			st1.add(6);
			st1.add(6);
			
			st2.add(5);
			st2.add(25);
			st2.add(11);
			st2.add(78);
			st2.add(19);
			st2.add(6);
			st2.add(6);
			System.out.println(st1);
			System.out.println(st2);
			
			Iterator it=st1.iterator();
			
			while(it.hasNext()==true) {
				System.out.println(it.next());
			}
		}

	}

