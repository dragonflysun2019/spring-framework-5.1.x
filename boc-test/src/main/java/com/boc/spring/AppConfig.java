package com.boc.spring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
//@Configurable
//@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan("com.boc.spring")
public class AppConfig {
	public void testAop(){
		System.out.println("appConfig!");
	}
}
