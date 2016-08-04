package com.endurance.india;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
        Dashboard bean = ctx.getBean(Dashboard.class);

        System.out.print("\n\n");
        bean.doSomething();
        System.out.print("\n\n");

        Thread.sleep(1500);

        ((ClassPathXmlApplicationContext) (ctx)).close();
    }

}