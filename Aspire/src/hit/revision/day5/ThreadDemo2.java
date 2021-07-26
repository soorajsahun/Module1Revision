package hit.revision.day5;

public class ThreadDemo2 {
public static void main(String[] args) {
	System.out.println("first line....");
	System.out.println("second line.....");
	//new Thread(()->{new ThreadDemo2().met();}).start(); - lambda
//	new Thread(new Runnable() {		
//		@Override
//		public void run() {
//			new ThreadDemo2().met();
//		}
//	}).start();
	new Thread(new MyRunnable()).start();
	//new ThreadDemo2().met();
	System.out.println("fourth line....");
}
public void met() {
	try{Thread.sleep(5000);}catch(Exception e) {}
	System.out.println("third line....");
}
}
class MyRunnable implements Runnable{
	@Override
	public void run() {
		new ThreadDemo2().met();	
	}
}