package Questions;

import java.util.Scanner;

public class Question3 {
	public static void swap(int i,int j,int[] arr) {
		int x=arr[i];
		arr[i]=arr[j];
		arr[j]=x;
	}

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
		
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++) {
				
				if(arr[j]>arr[j+1])
					swap(j,j+1,arr);
				
			}
		}
		
		for (int i:arr)
			System.out.print(i+" ");
		

	}

}
