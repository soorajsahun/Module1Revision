package hit.revision.day3;

public class ThreadDemo1 {
	public static void main(String[] args) throws Exception{
		Thread t=Thread.currentThread();
		System.out.println("5 sec pause");
//		met();
		ThreadDemo1.met();
		System.out.println(t);
		
		
	}
	static void met()throws Exception {
		Thread.currentThread();
		Thread.sleep(5000);
	}
}
