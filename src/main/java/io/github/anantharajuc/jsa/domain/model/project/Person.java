package io.github.anantharajuc.jsa.domain.model.project;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level= AccessLevel.PRIVATE)
@AllArgsConstructor
@ToString
@Getter
public class Person {
    final Integer id;
    final String firstName;
    final String lastName;
    final String email;
    final String gender;
    final Integer age;
}
