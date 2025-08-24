package ru.netology.HW_HIBERNATE.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "persons")
@Setter
public class Person {

    @EmbeddedId
    private PersonId personId;

    @Column(name = "phone_number")
    @Pattern(regexp = "^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$")
    private String phoneNumber;

    @Column(name = "city_of_living")
    private String cityOfLiving;

    public PersonId getPersonId() {
        return this.personId;
    }

    public @Pattern(regexp = "^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$") String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getCityOfLiving() {
        return this.cityOfLiving;
    }
}
