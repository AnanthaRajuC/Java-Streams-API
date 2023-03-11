package io.github.anantharajuc.jsa.domain.model.project;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level= AccessLevel.PRIVATE)
@AllArgsConstructor
public class Car {
    final Integer id;
    final String make;
    final String model;
    final String color;
    final Integer year;
    final Double price;
}
