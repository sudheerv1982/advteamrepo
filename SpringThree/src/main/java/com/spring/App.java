package com.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	BeanCollection obj = (BeanCollection) context.getBean("idCollection");
    	
    	obj.getAddressList();
    	obj.getAddressMap();
    	obj.getAddressProps();
    	obj.getAddressSet();
     
    }
}
