package com.bnaskov;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/bnaskov/beans/beans.xml");

		// the id: "person" is set in the beans.xml
		Person person = (Person) context.getBean("person");
		person.speak();

		System.out.println(person);

		((ClassPathXmlApplicationContext) context).close();
	}
}
