package org.hanelalo.rocketmq.rocketmqconsumer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface Consumer {

  String INPUT = "TEST";

  @Input(INPUT)
  SubscribableChannel input();
}
