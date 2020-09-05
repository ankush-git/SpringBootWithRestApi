package com.org.helloWorld.hello;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@Autowired
	private MessageSource messageSource; 

	@GetMapping("/getMessage")
	public HelloWorldBean getMessage() {
		return new HelloWorldBean("Hello world");
	}
	
	@GetMapping("/getHelloWorldBean/pathVariable/{name}")
	public HelloWorldBean getMessage(@PathVariable String name) {
		return new HelloWorldBean("Hello world "+name);
	}
	
	@GetMapping("/getHelloWorldBean/intern")
	public String getMessageI18n() {
		return messageSource.getMessage("good.morning.message", null, LocaleContextHolder.getLocale());
	}
}
