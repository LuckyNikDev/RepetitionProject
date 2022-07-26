package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	private Pet pet;
	@Value("${person.name}")
	private String name;

	@Autowired
	public Person(@Qualifier("dog") Pet pet) {
		this.pet = pet;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public void callYourPet() {
		System.out.println("Hello, my lovely pet! I'm " + name);
		pet.say();
	}
}
