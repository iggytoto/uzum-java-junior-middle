package org.uzum.iggytoto.java_dependencies.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
public class Person {

//    private final Person friend;
    private String name;
    private String email;
    private int age;

    @Override
    public Person clone() {
        return Person.
                builder().
                age(this.age).
                email(this.email).
                name(this.name).
                build();
    }
}
