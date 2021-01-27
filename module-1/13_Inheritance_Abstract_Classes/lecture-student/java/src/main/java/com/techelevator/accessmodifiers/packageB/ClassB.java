package com.techelevator.accessmodifiers.packageB;


import com.techelevator.accessmodifiers.packageA.ClassA;

public class ClassB {

  ClassA a = new ClassA();

  public void test() {
      a.methodA();
    }

   public boolean methodB() {
       return true;
   }
}
