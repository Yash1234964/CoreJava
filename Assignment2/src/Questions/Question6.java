package Questions;

import java.util.Scanner;

public class Question6 {
	
	
	// Checking arr1 is subset of arr2
	public static boolean check(int []arr1,int n1,int []arr2,int n2) {
		if(n1 > n2) return false;
		
		for(int i=0;i<n1;i++) {
			for(int j=0;j<n2;j++) {
				if(arr1[i]==arr2[j])
					arr1[i]-=arr2[j];
			}
		}
		
		for(int i=0;i<n1;i++)
			if(arr1[i]!=0) return false;
		
		return true;
		
	}

	public static void main(String[] args) {
		System.out.println("Enter size of Array1");
		Scanner sc= new Scanner(System.in);
		int n1=sc.nextInt();
		
		int []arr1 =new int[n1];
		System.out.println("Enter "+n1+" numbers");
		
		for(int i=0;i<n1;i++) {
			System.out.println("Enter "+(i+1)+" number");
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter size of Array2");
		
		
int n2=sc.nextInt();

		int []arr2 =new int[n2];
		System.out.println("Enter "+n2+" numbers");
		
		for(int i=0;i<n2;i++) {
			System.out.println("Enter "+(i+1)+" number");
			arr2[i]=sc.nextInt();
		}
		sc.close();
		
		if(check(arr1,n1,arr2,n2)) 
			System.out.println("Array1 is subset of Array2");
			else
				System.out.println("Array1 is not subset of Array2");
		

	}

}
