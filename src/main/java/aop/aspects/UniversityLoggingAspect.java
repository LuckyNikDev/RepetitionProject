package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

	@Before("execution(* getStudentList())")
	public void beforeGetStudentsLoggingAdvice() {
		System.out.println("beforeGetStudentsLoggingAdvice: добавление студентов");
	}

//	@AfterReturning(pointcut = "execution(* getStudentList())", returning = "students")
//	public void afterReturningGetStudentsMethod(List<Student> students) {
//		Student firstStudent = students.get(0);
//		System.out.println("Mr. " + firstStudent.getName() + ", Your name will be Mr. Niketoniun");
//		firstStudent.setName("Niketoniun");
//		System.out.println("afterReturningGetStudentsMethod: логирование/студенты добавлены");
//	}
//
//	@AfterThrowing(pointcut = "execution(* getStudentList())", throwing = "exception")
//	public void afterThrowingGetStudentsMethod(Throwable exception) {
//		System.out.println("afterThrowingGetStudentsMethod: Throwing " + exception);
//	}

	@After("execution(* getStudentList())")
	public void afterGetStudentsMethod() {
		System.out.println("afterGetStudentsMethod: Throwing ");
	}
}
