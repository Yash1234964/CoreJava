package Inheritance;

import java.util.Scanner;

abstract class Shape{
	public float area;
	abstract void input();
	abstract void compute();
	 void display() {
	 System.out.println("Area of the figure is "+area);	
	}
}
	 
	class Rectangle extends Shape{
         float width;
         float length;
	
		void input() {
			// TODO Auto-generated method stub
			System.out.println("Enter width of rectengle ");
			Scanner sc= new Scanner(System.in);
			 width=sc.nextFloat();
			System.out.println("Enter length of rectengle ");
			 length=sc.nextFloat();
			
		}

		
		void compute() {
			// TODO Auto-generated method stub
			area=width*length;
		}
		
		
	}
	
	class Square extends Shape{
        float side;
        
	
		void input() {
			// TODO Auto-generated method stub
			System.out.println("Enter side of square ");
			Scanner sc= new Scanner(System.in);
			 side=sc.nextFloat();
			
		
		}

		
		void compute() {
			// TODO Auto-generated method stub
			area=side*side;
		}
		
		
	}
	
	class Circle extends Shape{
        float radius;
        
	
		void input() {
			// TODO Auto-generated method stub
			System.out.println("Enter side of square ");
			Scanner sc= new Scanner(System.in);
			 radius=sc.nextFloat();
			
			
		}

		
		void compute() {
			// TODO Auto-generated method stub
			area=3.14f*radius*radius;
		}
		
		
	}
	
	 class Geometry {
		 void permit(Shape s) {
			 s.input();
			 s.compute();
			 s.display();
		 }
		
	}
	


public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		Rectangle r=new Rectangle();
		Square s=new Square();
		Circle c=new Circle();
		
		Geometry g=new Geometry();
		g.permit(r);
		g.permit(s);
		g.permit(c);
	}

}
