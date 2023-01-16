package com.example.demo;

import com.example.demo.crud.UserRepository;
import com.example.demo.crud.Model;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {


//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext context = SpringApplication.run(DemoApplication.class);

//		Saludo saludar = (Saludo) context.getBean("Saludo");
//		String text = saludar.imprimirSaludo();
//		System.out.println(text);
//
//		UserService not = new UserService(new NotificationService());
//		String imprime = not.notificationService.ImprimeSaludo();
//		System.out.println(imprime);
//

		UserRepository repository = context.getBean(UserRepository.class);

		Model user1 = new Model(1L, "antonio");

		repository.save(user1);
		System.out.println(repository.findAll());

	}

}
