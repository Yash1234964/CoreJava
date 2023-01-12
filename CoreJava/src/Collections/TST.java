package Collections;
import java.util.*;
public class TST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet st = new TreeSet();
		
		st.add(5);
		st.add(25);
		st.add(11);
		st.add(78);
		st.add(19);
		st.add(6);
		st.add(6);
		System.out.println(st);
		
		Iterator it=st.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
