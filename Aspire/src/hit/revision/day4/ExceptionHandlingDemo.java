package hit.revision.day4;
public class ExceptionHandlingDemo {
	public static void main(String[] args) {
		ExcepDemo obj=new ExcepDemo();
		try {
			obj.raise("ramu");
		}catch(CustomException ce) {
			System.out.println(ce);
		}
	}
}
class CustomException extends Exception{
	private String msg;
	public CustomException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "The Exception is..:"+msg;
	}
}
class ExcepDemo{
	public void raise(String name)throws CustomException {
		if(name.equals("ramu")) {
			throw new CustomException("ramu ramu ramu....come come come....");
		}
		else if(name.equals("somu")) {
			throw new CustomException("somu somu somu...come come come...");
		}
	}
}
