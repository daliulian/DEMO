package com.example.demo.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ***********************************************************
 *
 * @类名 : CommonData
 * @DESCRIPTION :
 * @AUTHOR :  liyoulian
 * @DATE :  2019/7/12
 *
 * ***********************************************************
 */
//限定该注解只能使用在类、接口或方法上
@Target(value = {ElementType.TYPE, ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
public @interface CommonData {
  //注解里面定义的是：注解类型元素！

  /**
   * 定义注解类型元素时需要注意如下几点：
   *
   * 访问修饰符必须为public，不写默认为public；
   * 该元素的类型只能是基本数据类型、String、Class、枚举类型、注解类型（体现了注解的嵌套效果）以及上述类型的一位数组；
   * 该元素的名称一般定义为名词，如果注解中只有一个元素，请把名字起为value（后面使用会带来便利操作）；
   * ()不是定义方法参数的地方，也不能在括号中定义任何参数，仅仅只是一个特殊的语法；
   * default代表默认值，值必须和第2点定义的类型一致；
   * 如果没有默认值，代表后续使用注解时必须给该类型元素赋值。
   */
  public String name();
  int age() default 18;
  int[] score();

}
