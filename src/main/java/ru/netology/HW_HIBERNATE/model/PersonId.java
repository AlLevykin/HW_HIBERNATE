package ru.netology.HW_HIBERNATE.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
public class PersonId implements Serializable {
    @NotBlank
    private String name;
    @NotBlank
    private String surname;
    @Min(0)
    @Max(120)
    private int age;
}
