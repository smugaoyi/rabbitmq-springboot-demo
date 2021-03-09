package org.example;

import org.example.config.RabbitConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @GetMapping("/test")
    public void test() {

        rabbitTemplate.convertAndSend(RabbitConfig.EXCHANGE_A, RabbitConfig.ROUTINGKEY_A, "aaaa");
        System.out.println("生产者发送成功");


    }
}
