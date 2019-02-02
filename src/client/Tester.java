package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		ApplicationContext apc  = new ClassPathXmlApplicationContext("configuration/spring.xml");
		
	}

}
