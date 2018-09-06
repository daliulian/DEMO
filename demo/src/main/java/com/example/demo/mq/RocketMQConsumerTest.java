package com.example.demo.mq;

/**
 * ***********************************************************
 *
 * @类名 : RocketMQConsumerTest
 * @DESCRIPTION :测试RocketMQ的消费
 * @AUTHOR :  admin
 * @DATE :  2018.9.6
 *
 * ***********************************************************
 */
public class RocketMQConsumerTest {

  public static void main(String[] args) {
    String mqNameServer="192.168.168.227:10911";
    String mqTopics = "MQ-MSG-TOPICS-TEST";

    String consumerMqGroupName = "CONSUMER-MQ-GROUP";
    RocketMQListener mqListener = new RocketMQListener();
    RocketMQConsumer mqConsumer = new RocketMQConsumer(mqListener, mqNameServer, consumerMqGroupName, mqTopics);
    mqConsumer.init();

    try {
      Thread.sleep(1000 * 60L);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }
}
