package StreamApiPractice;

import java.util.*;
import java.util.stream.Collectors;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Integer> arr= new ArrayList<Integer>();
        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        
        List<Integer> ans=arr.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(ans);
        
        List<Integer> ans1=arr.stream().map(i->i*2).collect(Collectors.toList());
        
        System.out.println(ans1);
	}

}
