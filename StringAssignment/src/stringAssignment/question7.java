package stringAssignment;

import java.util.Scanner;

public class question7 {

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
        
        boolean flag=false;
        
        for(int i=0;i<26;i++) {
        	if(arr[i]>1)
        		flag=true;
        }
        
        if(flag) {
        	System.out.println("String does not contain unique element");
        	
        }
        else
        	System.out.println("String contain unique element");

	}


	}

