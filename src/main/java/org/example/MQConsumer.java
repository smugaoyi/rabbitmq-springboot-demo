package org.example;

import org.example.config.RabbitConfig;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = RabbitConfig.QUEUE_A)
public class MQConsumer {

    @RabbitHandler
    public void process(String content) {

        System.out.println("消费===>");
        System.out.println("content: " + content);

    }
}
