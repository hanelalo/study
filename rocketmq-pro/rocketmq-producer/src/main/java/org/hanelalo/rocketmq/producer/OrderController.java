package org.hanelalo.rocketmq.producer;

import org.apache.rocketmq.spring.support.RocketMQHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("orders")
public class OrderController {

  @Autowired
  private Producer producer;

  @PostMapping("send/{userId}")
  public void sendOrder(@PathVariable("userId") String userId){
    producer
        .output()
        .send(
            MessageBuilder.withPayload(new User().setAge(10).setUsername(userId))
                .setHeader(RocketMQHeaders.TAGS, "Test-A")
                .build());
  }

  static class User {
    private String username;
    private int age;

    public String getUsername() {
      return username;
    }

    public User setUsername(String username) {
      this.username = username;
      return this;
    }

    public int getAge() {
      return age;
    }

    public User setAge(int age) {
      this.age = age;
      return this;
    }
  }

}
