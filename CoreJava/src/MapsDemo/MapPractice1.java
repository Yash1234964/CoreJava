package MapsDemo;

import java.util.*;
import java.util.Map.Entry;


public class MapPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap hm= new HashMap();
		
		hm.put(1,"yash");
		hm.put(2, "Ankit");
		hm.put(3,"Value");
		
		System.out.println(hm);
		System.out.println(hm.get(1));
		
		Collection c=hm.values();
		
		Iterator it= c.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Collection c1=hm.keySet();
		Iterator it1 =c1.iterator();
		
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		Set c3= hm.entrySet();
		Iterator it3 = c3.iterator();
		
		while(it3.hasNext())
		{
			Map.Entry data = (Entry) it3.next();
			System.out.println(data.getKey()+"---------->"+data.getValue());
		}
		
	
		
		
		

	}

}
