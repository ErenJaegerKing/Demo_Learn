//package com.sky.mq;
//
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Component;
//
////@Component
//public class listenerSimpleQueue {
//    @RabbitListener(queues = "simple.queue")
//    public void listenSimpleQueueMessage(String msg) throws InterruptedException {
//        System.out.println("spring 消费者接收到消息：【" + msg + "】");
//    }
//
//}
