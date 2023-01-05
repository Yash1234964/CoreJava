package Assignmentq1;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int x=0,y=16;
		for(int i=0;i<=16;i++) {
			for(int j=0;j<=16;j++) {
				
				if(i>=0 && i<=7)
					System.out.print(" ");
				
				if(i>7 && i<=16) {
				   if(j>x && j<y)
					   System.out.print(" ");
				   else
					   System.out.print("*");
				   
				}
				
			}
			if(i>7 && i<=16) {
				x++;
				   y--;
				}
			System.out.println();
		}
	}

}
