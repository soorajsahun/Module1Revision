package hit.revision.day2;
public class ArrayDemo {
	public static void main(String[] args) {
		int arr[]= {10,45,67,78,67};//array is declared and also initialized
		
		int myarr[]=new int[5];//array is just declared but still initialized with default values
		
		System.out.println(arr[0]);
		System.out.println(myarr[0]);
		
		myarr[0]=39393;//re initializing the array
		
		System.out.println(myarr[0]);
		
		for(int i=0;i<myarr.length;i++) {
			System.out.println(myarr[i]);
		}
		
		String s[]=new String[5];
		s[0]="hello world";
		
		System.out.println(s[1]);
		String ss[]= {"hello","hai"};
		
		for(String x:s) {
			System.out.println(x);
		}
	}
}