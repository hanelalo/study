package org.hanelalo.rocketmq.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(Producer.class)
public class RocketmqProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RocketmqProducerApplication.class, args);
    }

}
