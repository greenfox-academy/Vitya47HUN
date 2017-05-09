package com.todos;

import com.todos.model.Todo;
import com.todos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodosApplication implements CommandLineRunner {

	@Autowired
	TodoRepository TodoRepo;

	public static void main(String[] args) {
		SpringApplication.run(TodosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		TodoRepo.save(new Todo("I have to learn Object Relational Mapping"));
	}
}
