package hit.revision.day1;
public class OperatorsDemo2 {
	public static void main(String[] args) {
		//relational operators == - comparison
		
		int x=10;
		int y=10;
		
		//all relational operators return a boolean
		
		boolean result=x==y;
		System.out.println(result);
		System.out.println(x==y);//the code inside is called expression
		//An expression will always return a boolean - true/false
		System.out.println(x<y);//false
		System.out.println(x>y);//false
		System.out.println(x<=y);//lesser than or equal to - true
		System.out.println(x>=y);//greater than or equal to - true
		
		System.out.println(x!=y);//x not equal to y - false
		
		//logical operations
		
		//its a combination of two or more relational operations
		
		result=x<=10 && y>=20;//only if both the expressions are true, then the result will be true
		System.out.println(result);//false
		
		result=x<=10 || y>=20;//any one of the expressions are true, then the result will be true
		System.out.println(result);//true
		
	}
}