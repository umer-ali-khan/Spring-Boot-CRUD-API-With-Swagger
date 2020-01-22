package io.springbootrestapi.starterapp;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class CourseAPIApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(CourseAPIApplication.class);

		Map<String, Object> map = new HashMap<>();
		map.put("server.servlet.context-path", "/spring-boot-app");
		map.put("server.port", "8585");
		application.setDefaultProperties(map);
		application.run(args);
	}

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)  
		          .select()                                  
		          .apis(RequestHandlerSelectors.any())              
		          .paths(PathSelectors.any())                          
		          .build();  
	}

}
