package org.uzum.iggytoto.javacore_reflection.model;

public class Dog extends Animal {
    public Dog() {
        super("Dog",0);
    }

    @Override
    public void doVoice() {
        System.out.println("woof");
    }
}
