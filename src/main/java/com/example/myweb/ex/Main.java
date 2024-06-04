package com.example.myweb.ex;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		//xml 
		String src = "applicationContext.xm";
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(src);
		TV tv = ctx.getBean("tv", TV.class);
		tv.turnOn();
		tv.turnOff();
		tv.changeVolume(5);
	}

}