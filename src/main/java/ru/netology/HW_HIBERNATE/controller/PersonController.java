package ru.netology.HW_HIBERNATE.controller;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import ru.netology.HW_HIBERNATE.model.Person;
import ru.netology.HW_HIBERNATE.model.PersonId;
import ru.netology.HW_HIBERNATE.service.PersonService;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @GetMapping("/by-city")
    List<Person> getPersonsByCity(@RequestParam String city) {
        return service.getPersonsByCity(city);
    }

    @GetMapping("/")
    List<Person> getAll() { return service.fetchPersonList(); }

    @GetMapping("/{name}/{surname}/{age}")
    Person getPersonById(@PathVariable("name") String name,
                         @PathVariable("surname") String surname,
                         @PathVariable("age") int age)
    {
        PersonId personId = new PersonId(name, surname, age);
        return service.getPersonById(personId);
    }

    @DeleteMapping("/{name}/{surname}/{age}")
    public String deleteDepartmentById(@PathVariable("name") String name,
                                       @PathVariable("surname") String surname,
                                       @PathVariable("age") int age)
    {
        PersonId personId = new PersonId(name, surname, age);
        service.deletePersonById(personId);
        return "Deleted Successfully";
    }

    @PostMapping("/")
    public Person savePerson(
            @Valid @RequestBody Person person)
    {
        return service.savePerson(person);
    }

    @PutMapping("/{name}/{surname}/{age}")
    public Person updatePerson(@PathVariable("name") String name,
                               @PathVariable("surname") String surname,
                               @PathVariable("age") int age,
                               @Valid @RequestBody Person person)
    {
        PersonId personId = new PersonId(name, surname, age);
        return service.updatePerson(personId, person);
    }
}
