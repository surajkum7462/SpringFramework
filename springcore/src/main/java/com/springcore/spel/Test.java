package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;

import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		 ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/spel/spelconfig.xml");
         Demo d1=context.getBean("demo",Demo.class);
         System.out.println(d1);
         
	      SpelExpressionParser temp=  new SpelExpressionParser();
	      Expression ex= temp.parseExpression( "22+44");
	      System.out.println(ex.getValue());
	}

}
