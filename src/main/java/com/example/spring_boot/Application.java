package com.example.spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.data.mongo.MongoRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.Resource;

@SpringBootApplication
@ComponentScan(basePackages = { "com.example"})
//@EnableAutoConfiguration(exclude={MongoAutoConfiguration.class, MongoRepositoriesAutoConfiguration.class, MongoDataAutoConfiguration.class})
public class Application implements CommandLineRunner {

	@Resource
  	private CfRepository cfRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(cfRepository.findByName("test"));
	}
}
