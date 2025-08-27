package ru.netology.HW_HIBERNATE.service;

import org.springframework.stereotype.Service;
import ru.netology.HW_HIBERNATE.model.Person;
import ru.netology.HW_HIBERNATE.model.PersonId;
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

    public List<Person> fetchPersonList() { return personRepository.findAll(); }

    public Person getPersonById(PersonId personId) { return personRepository.findById(personId).orElse(null); }
    
    public void deletePersonById(PersonId personId) { personRepository.deleteById(personId); }

    public Person savePerson(Person person) { return personRepository.save(person); }

    public Person updatePerson(PersonId personId, Person person) {
        Person storedPerson = null;

        if (personRepository.existsById(personId)) {
            personRepository.deleteById(personId);
            storedPerson = personRepository.save(person);
        }

        return storedPerson;
    }
}
