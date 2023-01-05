package Assignmentq1;

public class Question3 {
 
	public static void main(String[] args) {
		
		int x=6,y=7;
		for(int i=0;i<14;i++) {
			for(int j=0;j<14;j++) {
				if(i>=0 && i<7) {
				if(x<j && j<y) 
					System.out.print(" ");
				
				else
					System.out.print("*");		
			}
				if(i>=7) {
					if(i==0 || i==13||j==0||j==13)
						System.out.print("*");
					else System.out.print(" ");
				}
				
			}
			x--;
			y++;
			System.out.println();
	}
	}

}
