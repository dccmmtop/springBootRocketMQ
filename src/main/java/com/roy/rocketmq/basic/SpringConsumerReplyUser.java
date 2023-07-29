package com.roy.rocketmq.basic;

import com.roy.rocketmq.domain.User;
import org.apache.rocketmq.spring.annotation.ConsumeMode;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQReplyListener;
import org.springframework.stereotype.Component;

@Component
@RocketMQMessageListener(consumerGroup = "MyConsumerGroup2", topic = "TestTopicUser",consumeMode= ConsumeMode.CONCURRENTLY)
public class SpringConsumerReplyUser implements RocketMQReplyListener<User,User> {


    @Override
    public User onMessage(User user) {
        System.out.println("收到User: " + user.toString());
        return user;
    }
}
