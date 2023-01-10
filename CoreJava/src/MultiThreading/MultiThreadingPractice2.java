package MultiThreading;


class MyRunnable implements Runnable{
	
	public void run() {
		
 	   for(int i=0;i<=5;i++) {
 		   System.out.println("Child Thread "+i);
 	   }
}
}
public class MultiThreadingPractice2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		MyRunnable r=new MyRunnable();
		Thread t= new Thread(r);
		t.start();
		t.join();
//		t.yield();
//		t.setName("Yash");
		System.out.println("Current Thread name "+Thread.currentThread().getName());
		for(int i=0;i<=5;i++) {
	 		   System.out.println("Parent Thread "+i);
	 	   }

	}

}
