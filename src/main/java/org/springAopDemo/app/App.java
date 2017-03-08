package org.springAopDemo.app;

import org.springAopDemo.customer.CustomerBo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) throws Exception {
		
		ApplicationContext appContext=new ClassPathXmlApplicationContext("Spring-Customer.xml");
		CustomerBo customer = (CustomerBo) appContext.getBean("customerBo");
		
		System.out.println("------------------------------------------------------------------------");
		customer.addCustomer();
		
		System.out.println("------------------------------------------------------------------------");	
		customer.addCustomerReturnValue();

		
		System.out.println("------------------------------------------------------------------------");
		//customer.addCustomerThrowException();
	
		System.out.println("------------------------------------------------------------------------");
		customer.addCustomerAround("Spring Aop Demo");
	
	}

}
