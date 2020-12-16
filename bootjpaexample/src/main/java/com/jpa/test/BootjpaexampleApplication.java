package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);

		UserRepository userRepository = context.getBean(UserRepository.class);

//		User user = new User();
//		user.setName("Gourav");
//		user.setCity("New Delhi");
//		user.setStatus("I am java web developer ");
//
//		User save = userRepository.save(user);
//
//		System.out.println(save);

		// Create object of user
//		User user1 = new User();
//		user1.setName("gourav");
//		user1.setCity("mumbai");
//		user1.setStatus("I am a java web developer.");
//
//		User user2 = new User();
//		user2.setName("neeru");
//		user2.setCity("delhi");
//		user2.setStatus("I am a teacher.");

		// save single user
		// User resultUser = userRepository.save(user2);

		// save multiple user
//		List<User> users = List.of(user1, user2);
//		Iterable<User> result = userRepository.saveAll(users);
//
//		result.forEach(user -> {
//			System.out.println(user);
//		});

//		System.out.println("saved user" + resultUser);

		// update the user id 2

//		Optional<User> optional = userRepository.findById(2);
//		User user = optional.get();
//		user.setName("rajni");
//		User resultuser= userRepository.save(user);
//		System.out.println(resultuser);
//		System.out.println("done");
//		

		// how to get the data
		// findbyid(id)-return Optional containing your data

//		Iterable<User> iterable = userRepository.findAll();

//		for (User user : iterable) {
//			System.out.println(user);
//		}
//		

		// Delete the user element

//		userRepository.deleteById(2);
//		System.out.println("deleted successfully..");

//		Iterable<User> alluser = userRepository.findAll();
//
//		for (User user : alluser) {
//			System.out.println(user);
//		}

//		userRepository.deleteAll(alluser);

//		List<User> names = userRepository.findByName("neeru");
//		List<User> names = userRepository.findByNameAndCity("gourav", "mumbai");
//		List<User> names = userRepository.findByNameStartingWith("g");
//
//		for (User user2 : names) {
//			System.out.println(user2);
//		}

//		List<User> users = userRepository.getAllUser();
//
//		for (User user : users) {
//			System.out.println(user);
//		}

//		List<User> name = userRepository.getUserByName("neeru");
//
//		for (User user : name) {
//			System.out.println(user);
//		}

		List<User> users = userRepository.getUser();

		for (User user : users) {
			System.out.println(user);
		}
	}

}
