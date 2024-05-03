package org.uzum.iggytoto.javacore_reflection.model;


public class Cat extends Animal {
    public Cat(int age) {
        super("Cat",age);
        //dasdasd/as

            System.out.println("Dddddd");

    }

    @Override
    public void doVoice() {
        System.out.println("meow");
    }
}
