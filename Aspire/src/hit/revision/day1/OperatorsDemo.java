package hit.revision.day1;
import java.util.Scanner;
public class OperatorsDemo {
	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter x value..:");
//		int x=scan.nextInt();
//		
//		System.out.println("Enter y value..:");
//		int y=scan.nextInt();
//		
//		int add=x+y;
//		System.out.println("Addition..:"+add);
//		int sub=x-y;
//		System.out.println("Subtraction..:"+sub);
//		int mul=x*y;
//		System.out.println("mul..:"+mul);
//		int div=x/y;//returns the quotient
//		System.out.println("Division..:"+div);
//		int reminder=x%y;
//		System.out.println("Reminder..:"+reminder);//mod (%) returns the reminder
//		
		//increment and decrement operator
		
		int n=10;
		System.out.println(n);
		System.out.println(n++);//n=n+1 - and n++ is post increment - which means first printing then incrementing
		System.out.println(n);
		System.out.println("+++++++++++++++++++++++++++++++");
		n=10;//re initializing n to 10
		System.out.println(n);
		System.out.println(++n);//n=n+1 - and ++n is pre increment - which means first incrementing then printing
		System.out.println(n);
		System.out.println("******************************************");
		n=10;
		System.out.println(n);
		System.out.println(n--);//n=n-1 - and n++ is post deccrement - which means first printing then decrementing
		System.out.println(n);
		System.out.println("+++++++++++++++++++++++++++++++");
		n=10;//re initializing n to 10
		System.out.println(n);
		System.out.println(--n);//n=n-1 - and --n is pre deccrement - which means first deccrementing then printing
		System.out.println(n);
		System.out.println("====================================================================");
		//when you want to increment a value by more than 1 in a short cut then use the below
		n=10;
		n+=10;//n=n+10;
		System.out.println(n);
		System.out.println(".....................................");
		n=10;
		n-=10;//n=n+10;
		System.out.println(n);
		System.out.println(".....................................");
		n=10;
		n*=10;//n=n+10;
		System.out.println(n);
		System.out.println(".....................................");
		n=10;
		n/=10;//n=n+10;
		System.out.println(n);System.out.println(".....................................");
		n=10;
		n%=10;//n=n+10;
		System.out.println(n);
			}
}