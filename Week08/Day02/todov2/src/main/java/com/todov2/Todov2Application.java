package com.todov2;

import com.todov2.model.Todo;
import com.todov2.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Todov2Application implements CommandLineRunner {

	@Autowired
	TodoRepository TodoRepo;

	public static void main(String[] args) {
		SpringApplication.run(Todov2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		TodoRepo.save(new Todo("I have to learn Object Relational Mapping"));
	}
}