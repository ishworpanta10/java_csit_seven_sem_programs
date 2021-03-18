import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class SendEmail {

	public static void main(String[] args) {
		final String email = "ishworpanta10@gmail.com";
		final String pass = "your_password_here";
		//creating props
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

//		creating session
		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(email, pass);
			}
		});

//		creating message obj
		Message message = new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress("ishworpanta10@gmail.com"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("ghimiresashita@gmail.com"));
			message.setSubject("This is Subject");
			message.setText("This is actual message");

			Transport.send(message);
			System.out.println("Your email has been sent successfully");

		} catch (MessagingException e) {

			throw new RuntimeException(e);

		}

	}

}
