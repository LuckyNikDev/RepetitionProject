package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Library library = context.getBean("library", Library.class);
		Book book = context.getBean("book", Book.class);
//		library.getBook();
//		library.getMagazine();
		System.out.println(library.returnBook());
//		library.returnMagazine();
//		library.addBook(book);
//		library.addMagazine();
		context.close();
	}
}
