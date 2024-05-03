package org.uzum.iggytoto.javacore_reflection.model;


public class Cat extends Animal {
    public Cat(int age) {
        super("Cat",age);

    }

    @Override
    public void doVoice() {
        System.out.println("meow");
    }
}
