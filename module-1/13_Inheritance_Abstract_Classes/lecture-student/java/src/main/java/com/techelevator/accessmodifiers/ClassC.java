package com.techelevator.accessmodifiers;

import com.techelevator.accessmodifiers.packageA.ClassA;

public class ClassC {

    public void methodC() {
        ClassA a = new ClassA();
        a.methodA();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
