package Inheritance;


 class sum{
	 public int sum(int... x) {
		 int sum=0;
		 
		 int n=x.length;
		 for(int i=0;i<n;i++) {
			 sum+=x[i];
		 }
		 return sum;
	 }
 }
public class ellipseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                sum s=new sum();
                int ans=s.sum(1,2,3,4,5);
                System.out.println(ans);
                
	}

}
