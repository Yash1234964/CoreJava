package Questions;
import java.util.Scanner;

public class Question2 {
	
	public static void swap(int i,int j,int[] arr) {
		int x=arr[i];
		arr[i]=arr[j];
		arr[j]=x;
	}
	
	public static int solve(int []arr , int start,int end ) {
		int pivot=arr[start];
		
		int ctr=0;
		for(int i=start+1;i<=end;i++) {
			if(arr[i]<=pivot)
				ctr++;
		}
		int index= start+ctr;
		
		swap(index,start,arr);
		
		int i=start,j=end;
		
		while(i<index && index<j) {
			while(arr[i]<=pivot) i++;
			while(arr[j]>pivot) j--;
			if(i<index && j>index)
			swap(i,j,arr);
		}
		return index;
		
	}
	
	public static void qSort(int []arr,int start,int end) {
		
		if(start >= end ) return;
		
		int pivot=solve(arr,start,end);
		solve(arr,start,end);
		qSort(arr,start,pivot-1);
		qSort(arr,pivot+1,end);
		
	
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
		
		qSort(arr,0,n-1);
		
		for (int i:arr)
			System.out.print(i+" ");
	}
}
