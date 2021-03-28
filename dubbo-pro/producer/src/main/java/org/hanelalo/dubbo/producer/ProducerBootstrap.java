package org.hanelalo.dubbo.producer;

import java.io.IOException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProducerBootstrap {

  public static void main(String[] args) throws IOException {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
    context.start();
    System.in.read();
  }
}
