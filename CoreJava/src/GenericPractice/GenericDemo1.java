package GenericPractice;

import java.util.*;

class Solve<T extends String>{
	T name;
//	T num;
	Solve(T name){
		this.name=name;
//		this.num=num;
	}
	
}


public class GenericDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solve solve=new Solve("yash");
		System.out.println(solve.name);
//		System.out.println(solve.num);
		

	}

}
