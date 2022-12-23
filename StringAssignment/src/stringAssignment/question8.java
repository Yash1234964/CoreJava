package stringAssignment;

import java.util.Scanner;

public class question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        
        int l=s.length();
        int arr[] = new int[26];
        
        for(int i=0;i<l;i++) {
        	if(s.charAt(i)!=' ')
        	arr[(s.charAt(i)-'a')]++;
        }
        
       int maxi=0;
       for(int i=0;i<26;i++) {
    	   if(arr[i]>maxi)
    		   maxi=arr[i];
        }
           for(int i=0;i<26;i++) {
        	   if(arr[i]==maxi)
        	   {
        		   System.out.println("Maximum element "+(char)(i+'a'));
        	   }
           }
  
	}

}
