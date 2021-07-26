package hit.revision.day5;

public class MultiThread1 {
public static void main(String[] args) {
	System.out.println("first line....");
	new Thread(new MyRunnable()).start();
	//System.out.println("second line.....");
	//new Thread(()->{new ThreadDemo2().met();}).start(); - lambda
//	new Thread(new Runnable() {		
//		@Override
//		public void run() {
//			new ThreadDemo2().met();
//		}
//	}).start();
		//new ThreadDemo2().met();
	System.out.println("fourth line....");
}
public void met() {
	try{Thread.sleep(5000);}catch(Exception e) {}
	System.out.println("third line....");
}
public void met1() {
	try{Thread.sleep(5000);}catch(Exception e) {}
	System.out.println("second line....");
}
}
class MyRunnable implements Runnable{
	@Override
	public void run() {
		new MultiThread1().met1();
		new MultiThread1().met();	
		
	}
}
