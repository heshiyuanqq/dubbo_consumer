package com.dubbo.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dubbo.test.pojo.User;
import com.dubbo.test.service.UserService;

public class Boot {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo_consumer.xml");
		UserService userService = (UserService) context.getBean("userService");
		System.out.println(userService.getClass());
		
		List<User> list = userService.getUserListByAge(23);
		for (User user : list) {
			System.out.println(user);
		}
		
	}

}
