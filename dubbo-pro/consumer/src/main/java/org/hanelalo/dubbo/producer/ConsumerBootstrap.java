package org.hanelalo.dubbo.producer;

import org.hanelalo.dubbo.def.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerBootstrap {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
    HelloService helloService = context.getBean(HelloService.class);
    String res = helloService.sayHello("Hanelalo");
    System.out.println(res);
  }
}
