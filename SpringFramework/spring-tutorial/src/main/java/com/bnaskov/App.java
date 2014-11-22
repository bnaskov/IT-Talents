package com.bnaskov;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new FileSystemXmlApplicationContext(
				"beans.xml");

		// the id: "person" is set in the beans.xml
		Person person = (Person) context.getBean("person");
		person.speak();
	}

}
