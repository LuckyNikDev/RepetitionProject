package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingLibraryAspect {

	@Pointcut("execution(* aop.Library.returnBook())")
	private void allReturnBookFromLibrary() {}

	@Around("allReturnBookFromLibrary()")
	public Object aroundReturnBookMethod(ProceedingJoinPoint point) throws Throwable {
		System.out.println("afterGetStudentsMethod: попытка вернуть книгу ");
		Object targetMethodAdvice;
		try {
			targetMethodAdvice = point.proceed();
			System.out.println("afterGetStudentsMethod: книга возвращена ");
		} catch (Exception e) {
			System.out.println("allReturnBookFromLibrary: получено исключение");
			targetMethodAdvice = "Неизвестная книга";
		}

		return targetMethodAdvice;
	}
}
