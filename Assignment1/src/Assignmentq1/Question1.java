package Assignmentq1;

public class Question1 {

	public static void main(String[] args) {
	 for(int i=0;i<=10;i++) {
		 for(int j=0;j<=93;j++) {
			 
			 //Printing I
			 
			 
			 if(j>=0 && j<10) {
			 if(i==0 || i==10) System.out.print("*");
			 else if(j==4) System.out.print("*");
			 else 
				 System.out.print(" ");
			 }
			 
			 
			 if(j>=10 && j<=13) {
				 System.out.print(" ");
			 }
			 
			 
			//Printing N
			 
			 
			 if(j > 13 && j<=23) {
				 if(j==14 || j==23) System.out.print("*");
				 else if(i==j-14)System.out.print("*");
				 else System.out.print(" ");
			 }
			 
			 
			 if(j>=24 && j<=26) {
				 System.out.print(" ");
			 }
			 
			 
			//Printing E
			 
			 
			 if(j>=27 && j<=37) {
				 if(j==27) System.out.print("*");
				 if(i==0 ||i ==5 ||i==10) System.out.print("*");
				 else System.out.print(" ");
			 }
			 
			 
			 if(j>=38 && j<=40) {
				 System.out.print(" ");
			 }
			 
			//Printing U
			 
			 
			 if(j>=41 && j<=50) {
				 if((j==41 || j==50)) System.out.print("*");
				 if(i==10 && j<50)System.out.print("*");
				 else System.out.print(" ");
			 }
			 
			 if(j>=51 && j<=53) {
				 System.out.print(" ");
			 }
	
			//Printing R
			 
			 
			 if(j>=54 && j<=64) {
				 if(j==54) System.out.print("*");
				 else if((i==0 || i==4) && j<61) System.out.print("*");
				 else if(j==61 && i>0 && i<4)System.out.print("*");
				  else if(i>=5 && i<=10 && i==j-54)System.out.print("*");
				 else System.out.print(" ");
			 }
			 
			 
			 
			 if(j>=65 && j<=68) {
				 System.out.print(" ");
			 }
			 
			 
			//Printing O
			 
			 
			 if(j>=69 && j<=79) {
				 if(i==0 || i==10 || j==69 || j==79)
					 System.out.print("*");
				 else System.out.print(" ");
			 }
			 
			 if(j>=80 && j<=82) {
				 System.out.print(" ");
			 }
			 
			//Printing N
			 
			 if(j>=83 && j<=93) {
				 if(j==83 || j==93) System.out.print("*");
				 else if(i==j-83)System.out.print("*");
				 else System.out.print(" ");
			 }
			 
			 
			 
			 
	 }
		 System.out.println();
	}
	 

}
}
