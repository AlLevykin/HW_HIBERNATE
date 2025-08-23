package ru.netology.HW_HIBERNATE.repository;

import ru.netology.HW_HIBERNATE.model.Person;

import java.util.List;

public interface CustomPersonRepository {
    List<Person> findAllByCity(String city);
}
