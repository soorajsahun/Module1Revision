package hit.revision.day1;
import java.util.Scanner;
public class ConditionDemo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter x value..:");
		int x=scan.nextInt();
		
		//within if, we will have an expression
//		if(x%2==0) {
//			
//		}
		
		boolean result=(x%2==0);
		
		if(result) {//this will check whether result is true
			System.out.println("Even number...:"+x);
		}
		else {
			System.out.println("Odd Number...:"+x);
		}
		
		//Switch case
		
//		switch(x%2) {
//		case 0:{}
//		}
		
		int reminder=x%2;
		switch(reminder) {
		case 0:{
			System.out.println("Evennnnnnnnnnnnnnnnnnnnnnnnnn..."+x);
			break;
		}
		case 1:{
			System.out.println("odddddddddddddddddddddddddddd...."+x);
			break;
		}
		}
		
		//Ternary Operator - ?
		//System.out.println((x%2==0)?"trueeeeeeeee":"falseeeeeeeeeeeee");
		String str=(x%2==0)?"eveeeeeeeeeeeeeeeeeeeeeeeeennnn":"odiiiiiiiiiiiiiiiiiiiii";
		System.out.println(str);
	}
}