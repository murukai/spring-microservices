package com.afrikatek.springmicroserviceschapterone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * The class the kick starts the application
 * Is is annotated as a rest controller and has the url mapping /hello
 * It is a spring boot application
 */
@RestController
@SpringBootApplication
@RequestMapping("/hello")
public class SpringMicroservicesChapterOneApplication {

	/**
	 *
	 * @param args command line arguments
	 *             This is the main method that kick starts the bootstraping of the application
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringMicroservicesChapterOneApplication.class, args);
	}

	/**
	 *
	 * @param firstName user first name recieved through a path variable on the url
	 * @param lastName user last name received through the path variable on the url
	 * @return returns a concatenation of the first name and the last name of the user
	 */
	@RequestMapping(method = RequestMethod.GET, path = "/{first-name}/{last-name}")
	public String sayHello(@PathVariable("first-name") String firstName, @PathVariable("last-name") String lastName){
		return "{ Hello -- " + firstName + " " + lastName + " }";
	}

}
