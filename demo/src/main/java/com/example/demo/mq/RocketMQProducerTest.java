package com.example.demo.mq;

import com.alibaba.rocketmq.common.message.Message;

/**
 * ***********************************************************
 *
 * @类名 : RocketMQProducerTest
 * @DESCRIPTION :MQ的生产者测试类
 * @AUTHOR :  admin
 * @DATE :  2018.9.6
 *
 * ***********************************************************
 */
public class RocketMQProducerTest {
  public static void main(String[] args) {

    String mqNameServer = "192.168.168.227:10911";
    String mqTopics = "MQ-MSG-TOPICS-TEST";

    String producerMqGroupName = "PRODUCER-MQ-GROUP";
    RocketMQProducer mqProducer = new RocketMQProducer(mqNameServer, producerMqGroupName, mqTopics);
    mqProducer.init();


    for (int i = 0; i < 5; i++) {

      Message message = new Message();
      message.setBody(("I send message to RocketMQ " + i).getBytes());
      mqProducer.send(message);
    }



  }


}
