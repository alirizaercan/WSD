package com.aliriza.STM;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.aliriza.STM.repository.TaskRepository;

@SpringBootApplication
public class StmApplication {

	public static void main(String[] args) {
		SpringApplication.run(StmApplication.class, args);
		TaskRepository.users.forEach(System.out::println);
	}

}
