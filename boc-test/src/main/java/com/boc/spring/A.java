package com.boc.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {

	//@Autowired(required = false)
	public A(){
		System.out.println("无参数构造方法");
	}
	//@Autowired(required = true)
	public A(AppConfig a){
		System.out.println("一个参数构造方法appconfig");
	}

	public A(B b){
		System.out.println("一个参数构造方法b");
	}

	public A(B b,AppConfig a){
		System.out.println("两个参数构造方法b");
	}

	public void testAop(){
		System.out.println("This is class A!");
	}
}
