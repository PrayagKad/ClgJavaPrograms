package com.app;


import com.app.beans.Marks;
import com.app.beans.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client
{
    public static void main( String[] args )
    {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("application-context.xml");

        //get bean

        Student st = beanFactory.getBean("st", Student.class);
        System.out.println(st);

        Marks mk = beanFactory.getBean("mk" ,  Marks.class);
        System.out.println(mk);

        Student st1 = beanFactory.getBean("st1" ,  Student.class);
        System.out.println(st1);


    }
}
