package org.epam.com;

import org.epam.com.beans.A;
import org.epam.com.beans.C;
import org.epam.com.beans.E;
import org.epam.com.beans.F;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

  public static void main(String[] args) {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
        "WEB-INF/applicationContext.xml");
    A a = (A) applicationContext.getBean("a");
    System.out.println(a.getExample1());
    System.out.println(a.getExample2());
    E e = (E) applicationContext.getBean("e");
    e.saySomething("eeee");
    C c = (C) applicationContext.getBean("c");
    c.getD()
     .sayHello();
    F f = (F) applicationContext.getBean("f");
    f.iLive();
    ((ClassPathXmlApplicationContext) applicationContext).destroy();
  }
}
