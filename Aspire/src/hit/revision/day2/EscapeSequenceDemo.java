package hit.revision.day2;
public class EscapeSequenceDemo {
	public static void main(String[] args) {
		System.out.println("Jack and jill went \"up\" the hill");
		
		System.out.println("Jack and jill went \'up\' the hill");
		
		System.out.println("Jack and jill went \\up\\ the hill");	
		
		System.out.println("Jack and jill went\n up \n the hill");
		
		System.out.println("Jack and jill went\f up \f the hill");//when u print, the output will come in three pages
		
		System.out.println("hello\b\b\b\b a");
		int i=1;
		while(true) {
			i++;
			if(i<1000000) {
				System.out.print(i+"\r");
				try {Thread.sleep(100);}catch(Exception e) {}
			}
		}
	}
}