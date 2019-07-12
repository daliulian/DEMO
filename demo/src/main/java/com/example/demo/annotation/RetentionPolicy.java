package com.example.demo.annotation;

/**
 * ***********************************************************
 *
 * @类名 : RetentionPolicy
 * @DESCRIPTION :
 * @AUTHOR :  liyoulian
 * @DATE :  2019/7/12
 *
 * ***********************************************************
 */
public enum RetentionPolicy {
  /**
   * Annotations are to be discarded by the compiler.
   * （注解将被编译器忽略掉）
   * 如果一个注解被定义为RetentionPolicy.SOURCE，则它将被限定在Java源文件中，那么这个注解即不会参与编译也不会在运行期起任何作用，
   * 这个注解就和一个注释是一样的效果，只能被阅读Java文件的人看到；
   */
  SOURCE,

  /**
   * Annotations are to be recorded in the class file by the compiler
   * but need not be retained by the VM at run time.  This is the default
   * behavior.
   * （注解将被编译器记录在class文件中，但在运行时不会被虚拟机保留，这是一个默认的行为）
   * 如果一个注解被定义为RetentionPolicy.CLASS，则它将被编译到Class文件中，那么编译器可以在编译时根据注解做一些处理动作，
   * 但是运行时JVM（Java虚拟机）会忽略它，我们在运行期也不能读取到；
   */
  CLASS,

  /**
   * Annotations are to be recorded in the class file by the compiler and
   * retained by the VM at run time, so they may be read reflectively.
   * （注解将被编译器记录在class文件中，而且在运行时会被虚拟机保留，因此它们能通过反射被读取到）
   * 如果一个注解被定义为RetentionPolicy.RUNTIME，那么这个注解可以在运行期的加载阶段被加载到Class对象中。
   * 那么在程序运行阶段，我们可以通过反射得到这个注解，并通过判断是否有这个注解或这个注解中属性的值，从而执行不同的程序代码段。
   * 我们实际开发中的自定义注解几乎都是使用的RetentionPolicy.RUNTIME；
   * ---------------------
   * 作者：cherry-peng
   * 来源：CSDN
   * 原文：https://blog.csdn.net/xsp_happyboy/article/details/80987484
   * 版权声明：本文为博主原创文章，转载请附上博文链接！
   * @see java.lang.reflect.AnnotatedElement
   */
  RUNTIME

}
