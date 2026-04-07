package com.app;

import com.app.beans.A;
import com.app.beans.B;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Client
{
    public static void main( String[] args )
    {


        BeanFactory beanFactory = new ClassPathXmlApplicationContext("application-context.xml");

        A a =  (A) beanFactory.getBean("a",A.class);
        System.out.println(a);

        B b = (B) beanFactory.getBean("ob",B.class);
        System.out.println(b);

    }
}
