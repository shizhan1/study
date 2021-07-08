//package com.whj.study.mq;
//
//
//import org.apache.rocketmq.spring.core.RocketMQTemplate;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.Resource;
//
//@RestController
//public class ProducerService {
//
//    @Resource
//    private RocketMQTemplate rocketMQTemplate;
//
//
//    @RequestMapping("producer")
//    public String produce() {
//
////        rocketMQTemplate.send("hello", MessageBuilder.withPayload("Hello, World! I'm from spring message").build());
//        rocketMQTemplate.convertAndSend("hello:world", "hello world");
//        System.out.println("生产者发送消息");
//
//        return "success";
//    }
//}
