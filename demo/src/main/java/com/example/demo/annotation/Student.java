package com.example.demo.annotation;

/**
 * ***********************************************************
 *
 * @类名 : Student
 * @DESCRIPTION :
 * @AUTHOR :  liyoulian
 * @DATE :  2019/7/12
 *
 * ***********************************************************
 */
public class Student {
  @CommonData(name = "daliulian",age=18,score = {666})
  public void study(int times){
    for (int i = 0; i < times; i++) {
      System.out.println("Good Good Study,Day Day up!");
    }
  }

}
