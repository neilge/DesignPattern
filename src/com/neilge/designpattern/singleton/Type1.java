package com.neilge.designpattern.singleton;

public class Type1 {

  public static void main(String[] args) {
    Singleton instance1 = Singleton.getInstance();
    Singleton instance2 = Singleton.getInstance();
    System.out.println(instance1 == instance2);
  }
}

// 饿汉式（静态变量）

class Singleton {

  // 1. 构造器私有化， 不可以new
  private Singleton() {}

  // 2. 内部创建对象实例
  private final static Singleton instance = new Singleton();

  // 3. 提供一个公有的静态方法，返回实例对象
  public static Singleton getInstance() {
    return instance;
  }
}
