package Questions;

import java.util.Scanner;

public class Question5 {
	public static void swap(int i,int j,int[] arr) {
		int x=arr[i];
		arr[i]=arr[j];
		arr[j]=x;
	}

	public static void main(String[] args) {
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
		
		for(int i=0;i<n-1;i++)
		{
			int minIdx=i;
			for(int j=i+1;j<n;j++ )
				
				if(arr[j]<arr[minIdx])
					minIdx=j;
			
			swap(i,minIdx,arr);
		}
		
		for (int i:arr)
			System.out.print(i+" ");
		
	}

}
