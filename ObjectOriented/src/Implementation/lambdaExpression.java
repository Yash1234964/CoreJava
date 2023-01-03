package Implementation;

interface Demo{
	void disp();
}
public class lambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo d=()->
		{
			System.out.println("Interface syntex.cpp");
		};
            d.disp();
	}

}
