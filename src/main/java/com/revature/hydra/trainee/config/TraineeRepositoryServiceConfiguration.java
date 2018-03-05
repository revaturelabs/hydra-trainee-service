package com.revature.hydra.trainee.config;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.revature.hydra.trainee.service.TraineeCompositionService;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableEurekaClient 
@EnableSwagger2
public class TraineeRepositoryServiceConfiguration {
	@Autowired
	TraineeCompositionService tcs;
	
	@Bean
	public AmqpTemplate rabbitTemplate(ConnectionFactory factory) {
		return new RabbitTemplate(factory);
	}
	
	@Bean
	public CommandLineRunner runner() {
		return args -> {
			
		};
	}
	
	@Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.basePackage("com.revature.hydra.trainee.controller"))              
          .paths(PathSelectors.any())                          
          .build();
    }
}
