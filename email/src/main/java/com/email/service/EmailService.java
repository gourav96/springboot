package com.email.service;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Service;

@Service
public class EmailService {

	public boolean sendEmail(String subject, String message, String to) {

		boolean f = false;

		String from = "gourav.srishti@gmail.com";

		// variable for gmail host
		String host = "smtp.gmail.com";

		// get the system properties
		Properties properties = System.getProperties();

		System.out.println("Smtp is now Starting....");

		// setting important information to properties object

		// host set

		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", "465");
		properties.put("mail.smtp.ssl.enable", "true");
		properties.put("mail.smtp.auth", "true");

		// step 1: to get the session object
		Session session = Session.getInstance(properties, new Authenticator() {

			String username = "gourav.srishti@gmail.com";
			String password = "********";

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {

				return new PasswordAuthentication(username, password);
			}

		});

		session.setDebug(true);

		// step 2 : compose the message [text,multi media]

		MimeMessage m = new MimeMessage(session);

		try {

			// form
			m.setFrom(from);

			// adding recipient to message (to)
			m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

			// adding subject to message
			m.setSubject(subject);

			// adding text to message
			m.setText(message);

			// send //
			// step 3 : send message using transport class
			Transport.send(m);

			System.out.println("Sent successfully");

			f = true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;

	}

}
