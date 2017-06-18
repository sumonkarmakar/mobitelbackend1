package com.mobitel.mobitelbackend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mobitel.mobitelbackend.dao.UserDAO;
import com.mobitel.mobitelbackend.model.User;

public class UserTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.scan("com.mobitel.mobitelbackend");

		context.refresh();
		// Insert a Supplier Object
		UserDAO userDAO = (UserDAO)context.getBean("userDAO");
		
		// Insertion test case
		User user = new User();
		
		/*supplier.setSupname("Loreal");
		supplier.setAddress("France");*/
		user.setUname("SUMON");
		user.setPassword("sk");
		user.setCustName("SUMON");
		user.setRole("Admin");
		user.setEnable(true);
		user.setEmail("sk@em.c");
		user.setAddress("Howrah");
		user.setMobile("1234");
		
		userDAO.insertUpdateUser(user);
		System.out.println("User Inserted");
	}

}
