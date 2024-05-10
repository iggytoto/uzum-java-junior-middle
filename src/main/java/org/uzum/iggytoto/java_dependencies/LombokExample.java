package org.uzum.iggytoto.java_dependencies;

import lombok.*;

public class LombokExample {

    @Getter
    @Setter
    @AllArgsConstructor
    @EqualsAndHashCode
    @NoArgsConstructor
    @ToString
    @Builder
    public static class Person {

        private String name;
        private String email;
        private int age;

        @Override
        public Person clone() {
            return Person.builder().age(this.age).email(this.email).name(this.name).build();
        }
    }


    @SneakyThrows
    public static void main(String[] args) {

        var p = new Person();
        p = new Person("test", "test@test.test", 33);
        p.setAge(32323);
        p.setName("asdasd");
        p.setEmail("dddd");

        var p2 = p.clone();

        System.out.println(p);
        System.out.println(p.equals(p2));

    }
}
