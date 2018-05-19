package org.epam.com;

import org.epam.com.beans.C;
import org.epam.com.beans.E;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

  public static void main(String[] args) {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
        "WEB-INF/applicationContext.xml");
    E e = (E) applicationContext.getBean("e");
    e.saySomething("eeee");
    C c = (C) applicationContext.getBean("c");
    c.getD().sayHello();
    ((ClassPathXmlApplicationContext) applicationContext).destroy();
  }
}
