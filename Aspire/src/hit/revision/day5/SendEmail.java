package hit.revision.day5;

import java.util.Properties;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {

	public static void sendMailFromGmail(String subject,String textBody,String myEmailAccount,String password) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of emails to send mail...");
		int n=scan.nextInt();
		//recipients email addresses
		Set<String> recipients=new TreeSet<String>();
		System.out.println("Type email addressess...");
		for(int i=0;i<n;i++) {
			recipients.add(scan.next()+"\n");
		}
		//creating session
		Properties prop = new Properties();
		prop.put("mail.smtp.starttls.enable", "true");
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.port", "587");
		
		
		Session session=Session.getInstance(prop, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				// TODO Auto-generated method stub
				return new PasswordAuthentication(myEmailAccount, password);
			}
		});
		
		//Compose message
		try {
		MimeMessage message=new MimeMessage(session);
		
		message.setFrom(new InternetAddress(myEmailAccount));
		for(String recipient:recipients) {
			if(isValidEmailAddress(recipient)==true) {
				String userName=getUserName(recipient);
				message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
				
				message.setSubject(subject);
				
				textBody="Dear Mr. "+userName+",\n"+textBody;
				message.setText(textBody);
				
				System.out.println("Sending the mail...");
				Transport.send(message);
				System.out.println("Mail sent succesfully...");
			}
		}
		
		}catch(MessagingException mex) {
			mex.printStackTrace();
		}
		
	}
	//checking valid email
	public static boolean isValidEmailAddress(String email) {
		   boolean result = true;
		   try {
		      InternetAddress emailAddr = new InternetAddress(email);
		      emailAddr.validate();
		   } catch (AddressException ex) {
		      result = false;
		   }
		   return result;
		}
	
	//extracting user name from email
	public static String getUserName(String email) {
		int index=email.indexOf("@");
		email=email.substring(0, index);
		return email;
	}
}
