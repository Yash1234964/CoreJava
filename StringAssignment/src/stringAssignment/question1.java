package stringAssignment;
import java.util.*;
public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter the string");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        s=s.toLowerCase();
        int l=s.length();
        int arr[] = new int[26];
        
        for(int i=0;i<l;i++) {
        	if(s.charAt(i)!=' ' && arr[s.charAt(i)-'a']==0)
        	arr[(s.charAt(i)-'a')]++;
        }
        for(int i=0;i<l;i++) {
        	if(s.charAt(i)!=' ' && arr[s.charAt(i)-'a']>0 )
        	{
        		arr[s.charAt(i)-'a']--;
        		System.out.print(s.charAt(i));
        	}
        	if(s.charAt(i)==' ')
        		System.out.print(" ");
        }
        
	}

}
