package com.example.demo.controller;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TestController {

  //多线程编程
  @RequestMapping("/launchCount")
  public void launchCount() throws InterruptedException{
    //1个计数器
    final CountDownLatch countDownLatch=new CountDownLatch(3);
    final ExecutorService exec = Executors.newFixedThreadPool(3);
    exec.submit(new Runnable() {
      @Override
      public void run() {
          try {
            System.out.println("线程1开始");
          }catch (Exception e){

          }finally {
            countDownLatch.countDown();//执行完成后，计数器减一
          }
      }
    });
    exec.submit(new Runnable() {
      @Override
      public void run() {
        try {
          System.out.println("线程2开始");
        }catch (Exception e){

        }finally {
          countDownLatch.countDown();
        }
      }
    });
    exec.submit(new Runnable() {
      @Override
      public void run() {
        try {
          System.out.println("线程3开始");
        }catch (Exception e){

        }finally {
          countDownLatch.countDown();
        }
      }
    });
    //等待三个线程都执行完毕，再执行主线程
    countDownLatch.await();
    System.out.println("==============end==============");
  }

}
