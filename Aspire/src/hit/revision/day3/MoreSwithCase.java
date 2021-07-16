package hit.revision.day3;
import java.util.Scanner;
public class MoreSwithCase {
	//A switch case can address the result of a evaluatin
	enum myenum {apple,mango,grapes};
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter a String..:");
		String s=scan.next();
		System.out.println("Please Enter a int...:");
		int i=scan.nextInt();
		System.out.println("Please Enter a char...:");
		char c=scan.next().charAt(0);
		
		//enums are static constants
		//A switch case can work on int, char, String (from jdk5) and enum (jdk5)
		
		switch(s) {
		case "hai":{
			System.out.println("hai value....."+s);
			break;
		}
		case "hello":{
			System.out.println("hello value...."+s);
			break;
		}
		default:{
			System.out.println("default of string switch called...."+s);
		}
		}
		System.out.println("\n....................................................");
		switch(i) {
		default:{
			System.out.println("default called...."+i);
			break;
		}
		case 1:{
			System.out.println("value of int is 1..."+i);
			break;
		}
		case 2:{
			System.out.println("value of int is 2..."+i);
			break;
		}
		case 3:{
			System.out.println("value of int is 3..."+i);
			break;
		}
			
		}
		System.out.println("\n character switch called..........................");
		switch(c) {
		case 'b':{
			System.out.println("b called....:"+c);
			break;
		}
		case 'a':{
			System.out.println("a called....:"+c);
			break;
		}
		default:{
			System.out.println("default of char called...:"+c);
		}
		}
		System.out.println("\n enum switch is called.......................");
		switch(myenum.apple) {
		case apple:{
				System.out.println("apple enum called...");
				break;
		}
		case grapes:{
			System.out.println("grapes enum called...");
			break;
		}
		
		default:{
			System.out.println("default of enum called...");
		}
		}
	}
}
