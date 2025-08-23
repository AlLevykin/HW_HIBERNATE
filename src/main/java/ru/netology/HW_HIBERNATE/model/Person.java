package ru.netology.HW_HIBERNATE.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "persons")
@Data
public class Person {

    @EmbeddedId
    private PersonId personId;

    @Column(name = "phone_number")
    @Pattern(regexp = "^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$")
    private String phoneNumber;

    @Column(name = "city_of_living")
    private String cityOfLiving;
}
