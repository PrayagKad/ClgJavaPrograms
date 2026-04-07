package com.app;

import com.app.beans.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Client
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        User user = (User)context.getBean("user", User.class);
        System.out.println(user);
    }
}
