package com.project.Task;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskApplication.class, args);
	}

//	@Bean
//	public ServletContextInitializer servletContextInitializer() {
//		return new ServletContextInitializer() {
//			@Override
//			public void onStartup(ServletContext servletContext) throws ServletException {
//				servletContext.getSessionCookieConfig().setMaxAge(15); // Set session timeout to 15 seconds
//			}
//		};

	}
