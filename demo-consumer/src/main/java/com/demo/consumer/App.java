package com.demo.consumer;

import com.demo.provider.xml.service;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * xml的方式调用
 *
 */
public class App
{
    public static void main( String[] args ) throws IOException {

        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        service providerService = (service) context.getBean("providerService");
        String str = providerService.sayHello("hello world!!");
        System.out.println(str);
        System.in.read();

    }
}
