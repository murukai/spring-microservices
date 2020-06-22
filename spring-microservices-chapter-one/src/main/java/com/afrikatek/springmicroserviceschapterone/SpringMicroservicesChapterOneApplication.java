package com.afrikatek.springmicroserviceschapterone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@RequestMapping("/hello")
public class SpringMicroservicesChapterOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroservicesChapterOneApplication.class, args);
	}

	@RequestMapping(method = RequestMethod.GET, path = "/{first-name}/{last-name}")
	public String sayHello(@PathVariable("first-name") String firstName, @PathVariable("last-name") String lastName){
		return "{ Hello -- " + firstName + " " + lastName + " }";
	}

}
