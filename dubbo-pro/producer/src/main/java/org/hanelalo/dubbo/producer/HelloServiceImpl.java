package org.hanelalo.dubbo.producer;

import org.hanelalo.dubbo.def.HelloService;

public class HelloServiceImpl implements HelloService {

  @Override
  public String sayHello(String name) {
    System.out.println("receive data: " + name);
    return "Hello " + name;
  }
}
