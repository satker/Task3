package org.epam.com.beans;

import java.lang.reflect.Method;
import org.springframework.beans.factory.support.MethodReplacer;

public class E implements MethodReplacer {

  public void saySomething(String s) {
    System.out.println("Hey " + s);
  }

  public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
    System.out.println("Hello");
    return obj;
  }
}
