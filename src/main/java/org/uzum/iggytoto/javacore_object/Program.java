package org.uzum.iggytoto.javacore_object;

public class Program {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person();
        person1.setEmail(new Email("test@test.test"));
        person1.setName("Jora");

        Person person2 = new Person();
        person2.setName("Suzan");
        person2.setEmail(new Email("suzan@test.test"));

        Person person3 = new Person();
        person3.setName(person1.getName());
        person3.setEmail(person1.getEmail());

        Person person1Clone = (Person) person1.clone();

        System.out.println(person1);
        System.out.println(person2);

        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(null));
        System.out.println(person1.equals(person3));
        System.out.println(person1.equals(person1Clone));

        final Email  e  =new Email();

        System.out.println(e.getValue());

    }
}
