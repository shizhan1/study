//package com.whj.study.mq;
//
//import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
//import org.apache.rocketmq.spring.core.RocketMQListener;
//import org.springframework.stereotype.Service;
//
//@Service
//@RocketMQMessageListener(topic = "hello", selectorExpression = "world", consumerGroup = "hello_group")
//public class ConsumerService implements RocketMQListener<String> {
//    @Override
//    public void onMessage(String s) {
//        System.out.println("---------------------consumer----------------");
//        System.out.println(s);
//    }
//}
