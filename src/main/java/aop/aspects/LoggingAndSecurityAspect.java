package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAndSecurityAspect {


//	@Pointcut("execution(* aop.Library.*(..))")
//	private void allForLibraryMethod() {}

//	@Before("aop.aspects.Pointcuts.allForLibraryMethod()")
//	public void beforeGetLoggingAdvice() {
//		System.out.println("beforeGetBookAdvice: logging try to get book/magazine");
//	}





//	@Pointcut("execution(* aop.Library.get*())")
//	private void allGetMethodFromLibrary() {}
//
//	@Pointcut("execution(* aop.Library.return*())")
//	private void allReturnMethodFromLibrary() {}
//
//	@Pointcut("execution(* aop.Library.addBook(..))")
//	private void allAddBookMethodFromLibrary() {}
//
//	@Pointcut("allGetMethodFromLibrary() || allReturnMethodFromLibrary()")
//	private void allGetAndReturnMethodFromLibrary() {}
//
//	@Before("allGetMethodFromLibrary()")
//	public void beforeGetLoggingAdvice() {
//		System.out.println("beforeGetBookAdvice: try to get book/magazine");
//	}
//
//	@Before("allReturnMethodFromLibrary()")
//	public void beforeReturnLoggingAdvice() {
//		System.out.println("beforeGetBookAdvice: try to RETURN book/magazine");
//	}
//
//	@Before("allAddBookMethodFromLibrary()")
//	public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
//		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
//		System.out.println("methodSignature - " + methodSignature);
//		Object[] args = joinPoint.getArgs();
//		for (Object o : args) {
//			if (o instanceof Book) {
//				System.out.println("args - " + ((Book) o).getName());
//			}
//		}
//		System.out.println("beforeGetBookAdvice: add book");
//	}



//	@Pointcut("execution(* get*(..))")
//	private void allGetMethods() {}
//
//
//	@Before("allGetMethods()")
//	public void beforeGetLoggingAdvice() {
//		System.out.println("beforeGetBookAdvice: try to get book/magazine");
//	}
//
//	@Before("allGetMethods()")
//	public void beforeGetSecurityAdvice() {
//		System.out.println("beforeGetSecurityAdvice: check of credentials to get book/magazine");
//	}
}
