/**
 * 
 */
package com.jk.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * junaid.khan
 *
 */

@Aspect
public class AspectConfig {

	// for all method execution ---all method execution
	// @Before("execution(* com.jk.aop.PaymentServiceImpl.*)") 
	// with argument method  -----with argument 
	// @Before("execution(* com.jk.aop.PaymentServiceImpl.makePayment(..))")
	

	@Before("execution(* com.jk.aop.PaymentServiceImpl.makePayment())")
	public void printBefore() {
		System.out.println("Payment Started.");
	}

	


	@After("execution(* com.jk.aop.PaymentServiceImpl.makePayment())")
	public void printAfter() {
		System.out.println("Payment done.");
	}


}
