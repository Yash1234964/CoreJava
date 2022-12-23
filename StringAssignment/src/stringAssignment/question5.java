package stringAssignment;

import java.util.Scanner;

public class question5 {

	public static void main(String[] args) {
		System.out.println("Enter first string");
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
       
        System.out.println("Enter second string");
        String s2=sc.nextLine();
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        
        		
        int arr[]=new int[26];
        int l1=s1.length(),l2=s2.length() ;
        boolean flag=true;
        
        if(l1!=l2) flag=false;
        
        if(l1==l2)
        for(int i=0;i<l1;i++) {
        	arr[s1.charAt(i)-'a']++;
        	arr[s2.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++)
        {
        	if(arr[i]!=0)
        		flag=false;
        }
        if(flag)
        	System.out.println("Both strings are anagram");
        else
        	System.out.println("Both strings are not anagram");
	}

}
