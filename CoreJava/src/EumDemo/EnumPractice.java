package EumDemo;

enum Results{
	PASS,FAIL,NR;
	
	Results(){
		System.out.println("Constructor is called");
	}
}

public class EnumPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Results results = Results.FAIL;
		
		System.out.println(results);
		
		
		Results arr[]= Results.values();
		
		for(Results i:arr) {
			System.out.println(i.ordinal()+"---->"+i.name());
		}
		
	}

}
