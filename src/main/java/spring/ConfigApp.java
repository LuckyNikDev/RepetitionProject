package spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("spring")
@PropertySource("application.properties")
public class ConfigApp {

	@Bean
	public Pet dogBean() {
		return new Dog();
	}

	@Bean
	public Person personBean() {
		return new Person(dogBean());
	}
}
