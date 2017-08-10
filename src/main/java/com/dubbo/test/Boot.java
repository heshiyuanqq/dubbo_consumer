package com.dubbo.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dubbo.test.pojo.User;
import com.dubbo.test.service.UserService;

public class Boot {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo_consumer.xml");
		for(int i=0;i<10;i++){
			UserService userService = (UserService) context.getBean("userService");
			System.out.println(userService.getClass());
			User user = userService.getUserById("0001");
			System.out.println(user);
		}
	
		
	}

}
