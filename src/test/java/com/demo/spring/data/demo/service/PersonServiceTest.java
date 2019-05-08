package com.demo.spring.data.demo.service;

import com.demo.spring.data.demo.config.DatabaseConfig;
import com.demo.spring.data.demo.model.Person;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class PersonServiceTest {

    @Autowired
    private PersonService personService;

    @Test
    public void savePerson() {
        Person person = new Person();
        Person personresult = new Person();
        person = personService.savePerson("Martin", "Champarini");
        personresult = personService.getPerson("Champarini");

        Assert.assertEquals(person, personresult);
    }
}