package spring;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Pet {
	private String name;

	@Override
	public void say() {
		System.out.println("may-may");
	}

	public void setName(String name) {
		this.name = name;
	}
}
