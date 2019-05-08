package com.demo.spring.data.demo.service;

import com.demo.spring.data.demo.data.PersonRepository;
import com.demo.spring.data.demo.model.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person savePerson(String firstName, String lastName) {
        Person person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        return personRepository.save(person);
    }

    public Person getPerson(String lastName) {
        return personRepository.findPersonByLastName(lastName);
    }
}
