package hit.revision.day5;


public class Sender {
	public static void main(String[] args) {
		String subject ="A Quick Hello & Thanks for Visiting Our Website !!!";
		String textBody = "<h1>Greetings To You.<h1> <br/> <h2> We're Welcoming You!!.<h2> <br/>"
				+ "Our GitHub URL: https://github.com/soorajsahun\n"
				+ "\n\n\nThanks & Regards,\nSuraj Sahu,\nE-Mail: suraj.sahu.9484@gmail.com ,\n";
	
		String myEmailAccount="suraj.sahu.9484@gmail.com";
		String password="xxxxxxxxxx";
		
		SendEmail.sendMailFromGmail(subject,textBody,myEmailAccount,password);
	}
}

