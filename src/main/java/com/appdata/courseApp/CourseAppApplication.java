package com.appdata.courseApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CourseAppApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	return application.sources(CourseAppApplication.class);
	} 
	public static void main(String[] args) {
		SpringApplication.run(CourseAppApplication.class, args);
	}

}
