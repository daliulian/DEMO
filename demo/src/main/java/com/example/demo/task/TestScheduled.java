package com.example.demo.task;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

@EnableScheduling
@Component
public class TestScheduled {

    //@Scheduled(cron = "0 1/1 * * * ? ")
    public void ss() {
        System.out.println("定时任务启动");
    }
}
