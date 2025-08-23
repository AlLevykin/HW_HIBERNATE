package ru.netology.HW_HIBERNATE.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import ru.netology.HW_HIBERNATE.model.Person;

import java.util.List;

public class CustomPersonRepositoryImpl implements CustomPersonRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Person> findAllByCity(String city) {
        return entityManager.createQuery("FROM persons p WHERE p.cityOfLiving = :city", Person.class)
                .setParameter("city", city)
                .getResultList();
    }

}
