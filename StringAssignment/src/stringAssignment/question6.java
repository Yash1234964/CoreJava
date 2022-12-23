package stringAssignment;

import java.util.Scanner;

public class question6 {

	public static void main(String[] args) {
		System.out.println("Enter the string");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        
        int l=s.length();
        int arr[] = new int[26];
        
        for(int i=0;i<l;i++) {
        	if(s.charAt(i)!=' ')
        	arr[(s.charAt(i)-'a')]++;
        }
        
        boolean flag=true;
        
        for(int i=0;i<26;i++) {
        	if(arr[i]==0)
        		flag=false;
        }
        
        if(flag) {
        	System.out.println("String is pangram");
        	
        }
        else
        	System.out.println("String is not a pangram");

	}

}
