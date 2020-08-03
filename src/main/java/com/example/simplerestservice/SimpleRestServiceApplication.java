package com.example.simplerestservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SimpleRestServiceApplication
{
	public static void main(String[] args)
	{
		ApplicationContext applicationContext=
				SpringApplication.run(SimpleRestServiceApplication.class, args);
		for(String name:applicationContext.getBeanDefinitionNames())
		{
			System.out.println(name);
		}

	}

}
