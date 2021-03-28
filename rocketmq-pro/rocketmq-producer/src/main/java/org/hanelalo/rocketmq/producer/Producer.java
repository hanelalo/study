package org.hanelalo.rocketmq.producer;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;

public interface Producer {

  String INPUT_SOURCE = "CONSUMER_TWO";
  String OUTPUT_SOURCE = "TEST";

//  @Input(INPUT_SOURCE)
//  PollableMessageSource source();

  @Output(OUTPUT_SOURCE)
  MessageChannel output();
}
