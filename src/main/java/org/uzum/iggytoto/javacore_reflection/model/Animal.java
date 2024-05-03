package org.uzum.iggytoto.javacore_reflection.model;

@Tagged("taasdasd")
public abstract class Animal implements Voice {
    private int feet = 4;
    private int age = 0;

    public String name;

    protected Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFeet() {
        return feet;
    }

    public int getAge() {
        return age;
    }
}
