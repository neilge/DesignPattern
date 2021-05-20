package com.neilge.designpattern.singleton;

public class Type1 {

  public static void main(String[] args) {
    Singleton instance1 = Singleton.getInstance();
    Singleton instance2 = Singleton.getInstance();
    System.out.println(instance1 == instance2);
  }
}

class Singleton {

  // 1. private constructor to prevent creating an instance from constructor
  private Singleton() {}

  private final static Singleton instance = new Singleton();

  public static Singleton getInstance() {
    return instance;
  }
}
