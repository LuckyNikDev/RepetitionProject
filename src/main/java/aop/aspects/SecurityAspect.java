package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {
//	@Before("aop.aspects.Pointcuts.allForLibraryMethod()")
//	public void beforeGetSecurityAdvice() {
//		System.out.println("beforeGetSecurityAdvice: check of credentials to get book/magazine");
//	}
}
