package com.example.demo.mq;

import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import com.alibaba.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import com.alibaba.rocketmq.common.message.MessageExt;
import java.util.List;

/**
 * ***********************************************************
 *
 * @类名 : RocketMQListener
 * @DESCRIPTION :MQ消息的监听接口类
 * @AUTHOR :  admin
 * @DATE :  2018.9.6
 *
 * ***********************************************************
 */
public class RocketMQListener implements MessageListenerConcurrently {
  @Override
  public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs, ConsumeConcurrentlyContext context) {
//        System.out.println("get data from rocketMQ:" + msgs);
    for (MessageExt message : msgs) {

      String msg = new String(message.getBody());
      System.out.println("msg data from rocketMQ:" + msg);
    }

    return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
  }

}
