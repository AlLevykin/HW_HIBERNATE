package ru.netology.HW_HIBERNATE.service;

import org.springframework.stereotype.Service;
import ru.netology.HW_HIBERNATE.model.Person;
import ru.netology.HW_HIBERNATE.repository.PersonRepository;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getPersonsByCity(String city) {
        return personRepository.findAllByCity(city);
    }
}
