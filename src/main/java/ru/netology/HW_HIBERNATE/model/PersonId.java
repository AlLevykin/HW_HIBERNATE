package ru.netology.HW_HIBERNATE.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class PersonId {
    @NotBlank
    private String name;
    @NotBlank
    private String surname;
    @Min(0)
    @Max(120)
    private int age;

    public PersonId(@NotBlank String name, @NotBlank String surname, @Min(0) @Max(120) int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public PersonId() {
    }

    public @NotBlank String getName() {
        return this.name;
    }

    public @NotBlank String getSurname() {
        return this.surname;
    }

    public @Min(0) @Max(120) int getAge() {
        return this.age;
    }

    public void setName(@NotBlank String name) {
        this.name = name;
    }

    public void setSurname(@NotBlank String surname) {
        this.surname = surname;
    }

    public void setAge(@Min(0) @Max(120) int age) {
        this.age = age;
    }
}
