package com.roy.rocketmq.basic;

import org.apache.rocketmq.spring.annotation.ConsumeMode;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQReplyListener;
import org.springframework.stereotype.Component;

@Component
@RocketMQMessageListener(consumerGroup = "MyConsumerGroup1", topic = "TestTopicString",consumeMode= ConsumeMode.CONCURRENTLY)
public class SpringConsumerReplyString implements RocketMQReplyListener<String,String>{
    @Override
    public String onMessage(String message) {
        System.out.println("收到消息，并返回结果 "+ message);
        return "返回消息" + message;
    }

}
