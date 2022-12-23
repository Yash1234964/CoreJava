package stringAssignment;

import java.util.Scanner;

public class question4 {
 static	boolean isVowel(char ch) {
		
		if((ch>=97 && ch<=122) || (ch>=65 && ch<=90) )
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				return true;
			}
		return false;
	}
	
static boolean isConsonant(char ch) {
		
		if((ch>=97 && ch<=122) || (ch>=65 && ch<=90) )
			if(ch!='a'||ch!='e'||ch!='i'||ch!='o'||ch!='u'||ch!='A'||ch!='E'||ch!='I'||ch!='O'||ch!='U') {
				return true;
			}
		return false;
	}
static boolean isSpecial(char ch) {
	
	if((ch>=97 && ch<=122) || (ch>=65 && ch<=90) )
		return false;
	
	 return true;
}

	public static void main(String[] args) {
		
		System.out.println("Enter the string");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        int l=s.length(),v=0,c=0,sp=0;
        for(int i=0;i<l;i++) {
        	if(isVowel(s.charAt(i)))
        		v++;
        	else if(isConsonant(s.charAt(i)))
        		c++;
        	else if(isSpecial(s.charAt(i))) sp++;
        }
        System.out.println("Number of vowel "+v);
        System.out.println("Number of consonants "+c);
        System.out.println("Number of special charaters "+sp);
        
	}

}
