package aop;

import org.springframework.stereotype.Component;

@Component
public class Library {

	public void getBook() {
		System.out.println("I take book");
	}

	public void getMagazine() {
		System.out.println("I take magazine");
	}


	public String returnBook() {
		System.out.println("I return book");
		return "War and peace";
	}

	public void returnMagazine() {
		System.out.println("I return Magazine");
	}

	public void addBook(Book book) {
		System.out.println("I add book: " + book.getName());
	}

	public void addMagazine() {
		System.out.println("I add Magazine");
	}

}
