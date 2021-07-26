package hit.revision.day3;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class String1 {
	public static void main(String[] args) {
		Set<String> set=new TreeSet<String>();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=scan.nextInt();
		System.out.println("Enter name");
		for(int i=0;i<n;i++) {
			set.add(scan.next());
		}
		
	}
}