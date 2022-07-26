package spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class Dog implements Pet {
	private String name;

	@Override
	public void say() {
		System.out.println("Gav-gav");
	}

	public void setName(String name) {
		this.name = name;
	}

	@PostConstruct
	public void init() {
		System.out.println("in the initmethod");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("in the destroy");
	}
}
