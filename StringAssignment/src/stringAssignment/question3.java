package stringAssignment;

import java.util.Scanner;

public class question3 {
	public static boolean isPalindrome(String str) {
		
		int l=str.length();
		int i=0,j=l-1;
		while(i<j) {
			if(str.charAt(i++)!=str.charAt(j--))
				return false;
		}
		return true;
		
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the string");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        if(isPalindrome(s))
        	System.out.println("String is palindrome");
        else
        	System.out.println("String is not palindrome");
	}

}
