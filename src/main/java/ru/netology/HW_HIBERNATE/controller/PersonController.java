package ru.netology.HW_HIBERNATE.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.HW_HIBERNATE.model.Person;
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
}
