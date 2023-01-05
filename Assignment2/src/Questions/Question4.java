package Questions;

import java.util.Scanner;

public class Question4 {
	
	public static void merge(int []arr,int start,int end)
	{
	
		int mid=start+(end-start)/2;
		int l1=mid-start+1;
		int l2=end-mid;
		
		int []arr1=new int[l1];
		int []arr2=new int[l2];
		
		int mainIndex=start;
		for(int i=0;i<l1;i++)
			arr1[i]=arr[mainIndex++];
		
		for(int i=0;i<l2;i++)
			arr2[i]=arr[mainIndex++];
		
		int index1=0;
		int index2=0;
		mainIndex=start;
		while(index1 < l1 && index2<l2) {
			if(arr1[index1] < arr2[index2])
				arr[mainIndex++]=arr1[index1++];
			else
				arr[mainIndex++]=arr2[index2++];
		}
		
		while(index1 <l1)
			arr[mainIndex++]=arr1[index1++];
		
		while(index2 < l2)
			arr[mainIndex++]=arr2[index2++];
		
	}
	
	public static void mSort(int []arr,int start,int end) {
		if(start>=end) return;
		int mid=start+(end-start)/2;
		
		
		mSort(arr,start,mid);
		mSort(arr,mid+1,end);
		
		merge(arr,start,end);
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
		
		mSort(arr,0,n-1);
		
		for (int i:arr)
			System.out.print(i+" ");

	}

}
