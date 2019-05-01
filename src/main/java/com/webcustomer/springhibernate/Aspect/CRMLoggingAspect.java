package com.webcustomer.springhibernate.Aspect;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CRMLoggingAspect {
	
	//setup logger
	private Logger myLogger = Logger.getLogger(getClass().getName());
	
	//setup controller pointcut declarations
	@Pointcut("execution(* com.webcustomer.springhibernate.Controllers.*.*(..))")
	private void forControllerPackage() {
		
	}
	//setup service pointcut declarations
	@Pointcut("execution(* com.webcustomer.springhibernate.Service.*.*(..))")
	private void forServicePackage() {
			
	}
	//setup dao pointcut declarations
	@Pointcut("execution(* com.webcustomer.springhibernate.DAO.*.*(..))")
	private void forDAOPackage() {
			
	}
	//combine pointcut
	@Pointcut("forControllerPackage() || forServicePackage() || forDAOPackage()")
	private void forAppFlow() {
		
	}
	//add @Before advice
	@Before("forAppFlow()")
	public void before(JoinPoint joinPoint) {
		//display method we're calling
		String method = joinPoint.getSignature().toShortString();
		myLogger.info("============> in @Before : Calling Method => "+method);
	}
	//add @AfterReturning advice
	@After("forAppFlow()")
	public void after(JoinPoint joinPoint) {
		//display method we're calling
		String method = joinPoint.getSignature().toShortString();
		myLogger.info("============> in @After : Calling Method => "+method);
	}
}
