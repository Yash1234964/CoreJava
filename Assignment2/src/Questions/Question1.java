package Questions;
import java.util.*;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter size of Array");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		int []arr =new int[n];
		System.out.println("Enter "+n+" numbers");
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter "+(i+1)+" number");
			arr[i]=sc.nextInt();
		}
		sc.close();
		System.out.println();
		
		boolean f=false;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i]==arr[j]  && i<j) {
					System.out.println(arr[i]);
					f=true;
				}
			}
		}
		if(!f)
			System.out.println("No duplicates found");
	}

}
