package com.boc.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;
import org.springframework.util.function.SupplierUtils;

@Component
public class BocBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition a = (GenericBeanDefinition) beanFactory.getBeanDefinition("a");
		//自动装配，会让传入参数无效
		//a.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_CONSTRUCTOR);
		//宽松构造方式推断，默认false
		//a.setLenientConstructorResolution(false);
		//用Supplier可以不用推断构造方法
		a.setInstanceSupplier(()->new A(beanFactory.getBean(B.class)));
		//手动装配---程序员传入构造方法参数---推断构造函数
		//a.getConstructorArgumentValues().addGenericArgumentValue(beanFactory.getBean(B.class));
	}
}
