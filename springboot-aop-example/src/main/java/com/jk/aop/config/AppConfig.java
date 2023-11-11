/**
 * 
 */
package com.jk.aop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.jk.aop.PaymentServiceImpl;
import com.jk.aop.aspect.AspectConfig;

/**
 * junaid.khan
 *
 */
@Configuration
@EnableAspectJAutoProxy
public class AppConfig {

	@Bean
	public PaymentServiceImpl payment() {
		return new PaymentServiceImpl();
	}

	@Bean
	public AspectConfig aspectConfig() {
		return new AspectConfig();
	}

}
