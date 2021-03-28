package org.hanelalo.rocketmq.rocketmqconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(Consumer.class)
public class MessageListener {
  private static final Logger logger = LoggerFactory.getLogger(MessageListener.class);

  @StreamListener(Consumer.INPUT)
  public void read(User user){
    logger.info("receive data: {}", user);
  }

}
