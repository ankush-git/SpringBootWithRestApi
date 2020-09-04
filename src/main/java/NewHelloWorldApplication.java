import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("in28min.helloWorld")
@SpringBootApplication
public class NewHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewHelloWorldApplication.class, args);
	}
	
//	@Bean
//	public LocaleResolver localeResolver() {
//		SessionLocaleResolver localeResolver = new SessionLocaleResolver();
//		localeResolver.setDefaultLocale(Locale.US);
//		return localeResolver();
//	}
	
//	@Bean
//	public ResourceBundleMessageSource messageSource() {
//		ResourceBundleMessageSource rbms =  new ResourceBundleMessageSource();
//		rbms.addBasenames("messages");
//		return rbms;
//	}

}

