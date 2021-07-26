package hit.revision.day4;

import java.util.Properties;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import javax.mail.Session;

public class SendEmail {
	public static void main(String[] args) {
		SendEmail.sendMailFromGamil();
	}
	public static void sendMailFromGamil() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of emails to send mail...");
		int n=scan.nextInt();
		
		Set<String> recipients=new TreeSet<String>();
		System.out.println("Type email addressess...");
		for(int i=0;i<n;i++) {
			recipients.add(scan.next()+"\n");
		}
		
		Properties prop=new Properties();
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.starttls.enable", "true");
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.port", "587");
		
		Session
	}
	
}

