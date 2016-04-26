package com.hengda.hdb.id.facade;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-id-test.xml");
		IDFacade idFacade = ctx.getBean(IDFacade.class);
		
		for (int i=0; i < 10000; i++ ) {
			System.out.println(idFacade.getId());
		}
	}
}
