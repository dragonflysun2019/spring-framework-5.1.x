package com.boc.spring;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspectJ {
	@Pointcut("execution(* com.boc.spring.*.*(..))")
	void pointCut(){}


	@Before("pointCut()")
	void before(){
		System.out.println("AspectJ before");
	}
}
