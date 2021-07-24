package hit.revision.day4;
/*
 * Our first objective in exception handling is to stop the abnormal closure of your application
 * by using try and catch block
 * 1. This program proves that try and catch can stop the abnormal termination of the program..
 * 2. We can also print the exception
 * Two objectives
 * 1. Program is saved from termination
 * 2. You get to know the exception by printing it.
 * 3. You also learned how to run a code irrespective whether an exception arises or not and also handled or not
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("Before Exception");
		try {
			int i=1/Integer.parseInt(args[0]);
		}
		catch(ArithmeticException ae) {
			System.out.println("See boss, what you did I did not like");
		}
		catch(ArrayIndexOutOfBoundsException aee) {
			System.out.println("boss boss,,,,, please enter command line");
		}
		
//		catch(Exception e) {
//			if(e instanceof ArithmeticException) {
//				System.out.println("See boss, what you did I did not like,,,,... dont divide the number by zero");
//			}
//			else if(e instanceof ArrayIndexOutOfBoundsException) {
//				System.out.println("boss boss,,,,, please enter command line arguments......please please..");
//			}
//			System.out.println("unknown exception.........scratching head.............");
//		}
		finally {
			/*
			 * when you want a code to be executed irrespective of
			 * 1. Whether an exception arises or not.
			 * 2. Whether an exception is handled or not
			 * 3. In all cases, I want this code to be executed.
			 * Such code is written in finally block...
			 */
			System.out.println("finally called...");
		}
		System.out.println("After Exception");
	}
}





