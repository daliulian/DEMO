package com.example.demo.annotation;

import java.lang.reflect.Method;

/**
 * ***********************************************************
 *
 * @类名 : TestAnnotation
 * @DESCRIPTION :
 * @AUTHOR :  liyoulian
 * @DATE :  2019/7/12
 *
 * ***********************************************************
 */
public class TestAnnotation {

  public static void main(String[] args) {
    try {
      //获取Student的Class对象
      Class stuClass=Class.forName("com.example.demo.annotation.Student");
      //
      Method stuMethod=stuClass.getMethod("study",int.class);

      if(stuMethod.isAnnotationPresent(CommonData.class)){
        System.out.println("配置了CommonData标签");
        CommonData commonData=stuMethod.getAnnotation(CommonData.class);
        System.out.println("name="+commonData.name()+" age="+commonData.age()+" scode="+commonData.age());
      }else{
        System.out.println("没有配置CommonData标签");
      }
    }catch (Exception e){
      e.printStackTrace();
    }

  }
}
