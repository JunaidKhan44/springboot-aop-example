package com.jk.aop;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@SpringBootApplication
public class SpringbootAopExampleApplication implements ApplicationContextAware {

	@Autowired
	private static ApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAopExampleApplication.class, args);

		System.out.println("++++ Project  Started +++++");

		PaymentServiceImpl bean = context.getBean(PaymentServiceImpl.class);
		bean.makePayment();
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;

	}

}
