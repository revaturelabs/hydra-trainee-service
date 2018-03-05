package com.revature.hydra.trainee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import com.revature.hydra.trainee.data.TraineeRepository;
import com.revature.hydra.trainee.service.TraineeCompositionService;

@SpringBootApplication
@EntityScan({ "com.revature.beans" })
@ComponentScan({ "com.revature.hydra.trainee.service", "com.revature.hydra.trainee.config" })
public class TraineeRepositoryServiceApplication {
	@Autowired
	TraineeCompositionService tcs;
	
	@Autowired
	TraineeRepository tr;

	public static void main(String[] args) {
		SpringApplication.run(TraineeRepositoryServiceApplication.class, args);
	}
}
