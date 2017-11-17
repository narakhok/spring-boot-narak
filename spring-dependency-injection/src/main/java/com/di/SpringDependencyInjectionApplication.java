package com.di;

import java.util.Arrays;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.di.services.User;

@ComponentScan
@SpringBootApplication
public class SpringDependencyInjectionApplication {

	@Bean
	public User user() {
		return new User("Narak", "Hok");
	}

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDependencyInjectionApplication.class, args);
		String[] beanName = ctx.getBeanDefinitionNames();
		Arrays.sort(beanName);
		for (String name : beanName) {
			System.out.println(name);
		}
		System.out.println(ctx.getBean("user").toString());

	}

}
