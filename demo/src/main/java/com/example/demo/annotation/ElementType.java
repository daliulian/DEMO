package com.example.demo.annotation;

/**
 * ***********************************************************
 *
 * @类名 : ElementType
 * @DESCRIPTION :
 * @AUTHOR :  liyoulian
 * @DATE :  2019/7/12
 *
 * ***********************************************************
 */
public enum ElementType {
  /** 类，接口（包括注解类型）或枚举的声明 */
  TYPE,

  /** 属性的声明 */
  FIELD,

  /** 方法的声明 */
  METHOD,

  /** 方法形式参数声明 */
  PARAMETER,

  /** 构造方法的声明 */
  CONSTRUCTOR,

  /** 局部变量声明 */
  LOCAL_VARIABLE,

  /** 注解类型声明 */
  ANNOTATION_TYPE,

  /** 包的声明 */
  PACKAGE

}
