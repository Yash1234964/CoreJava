
package MultiThreading;


 class Demo extends Thread{
	
       public void run() {
    	   for(int i=0;i<=5;i++) {
    		   System.out.println("Child Thread "+i);
    	   }
       }
}
public class multiThreadingPractise {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		Demo l=new Demo();
				l.start();
//			            Thread.sleep(1000);
				for(int i=0;i<=5;i++) {
		    		   System.out.println("Parent Thread"+i);
		    	   }
	}

}
