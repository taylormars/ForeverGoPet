package com.pets.service;

import javassist.ClassPath;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liyut on 2017-12-13.
 */
public class BeginProvider {
    public static void main(String args[])throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String []{"provider.xml"});
        context.start();
        System.out.printf("提供方开启");
        System.in.read();
    }
}
