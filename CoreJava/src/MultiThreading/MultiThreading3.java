package MultiThreading;


 class  Display{
	
	public synchronized void  wish(String name) {
		try {
			for(int i=0;i<5;i++) {
				System.out.println("Thread Name "+name);
			}
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			
		}
	}
}

class MyThread extends Thread{
	
	Display d;
	String name;
	
	public MyThread(Display d,String name) {
		this.d=d;
		this.name=name;
	}
	public void run() {
		d.wish(name);
	}
}

public class MultiThreading3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Display d=new Display();
//		Display d1=new Display();
		
		MyThread t1=new MyThread(d,"Aman");
		MyThread t2=new MyThread(d,"Aditya");
		t1.start();
		t2.start();

	}

}
