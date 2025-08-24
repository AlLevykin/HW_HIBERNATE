package ru.netology.HW_HIBERNATE.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
public class PersonId {
    @NotBlank
    private String name;
    @NotBlank
    private String surname;
    @Min(0)
    @Max(120)
    private int age;

    public @NotBlank String getName() {
        return this.name;
    }

    public @NotBlank String getSurname() {
        return this.surname;
    }

    public @Min(0) @Max(120) int getAge() {
        return this.age;
    }
}
