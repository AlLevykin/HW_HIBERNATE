package ru.netology.HW_HIBERNATE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.netology.HW_HIBERNATE.model.Person;
import ru.netology.HW_HIBERNATE.model.PersonId;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, PersonId>, CustomPersonRepository {
    List<Person> findAllByCity(String city);
    List<Person> findAllByPersonIdAgeLessThanOrderByPersonIdAge(int age);
    Optional<List<Person>> findAllByPersonIdNameAndPersonIdSurname(String name, String surname);
}
