package org.lewis.demo.ws.soap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-client-2.xml");

		HelloService helloService = context.getBean("helloService", HelloService.class);
		String result = helloService.say("world");
		System.out.println(result);
	}

}
