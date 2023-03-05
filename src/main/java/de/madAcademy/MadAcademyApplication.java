package de.madAcademy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = {
		"de.madAcademy" })
public class MadAcademyApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(MadAcademyApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MadAcademyApplication.class);
	}

}
