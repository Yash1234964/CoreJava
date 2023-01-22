package StreamApiPractice;
import java.util.*;

//interface interf{
//	void solve(int i);
//}
class Sample
{
private String s;
Sample(String s){
this.s = s;
System.out.println("Constructor executed...."+s);
}
}


interface Interf
{
public Sample get(String s);
}


public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interf i = s -> new Sample(s);
		i.get("from lambda expression...");
		System.out.println();
		//constructor reference
		Interf i1 = Sample::new;
		i1.get("from constructor reference....");
	}

}
