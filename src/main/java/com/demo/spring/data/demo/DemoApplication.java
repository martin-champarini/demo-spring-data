package com.demo.spring.data.demo;

import com.demo.spring.data.demo.model.Person;
import com.demo.spring.data.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private PersonService personService;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Person person = new Person();
        Person personresult = new Person();
        person = personService.savePerson("Martin", "Champarini");
        personresult = personService.getPerson("Champarini");

        System.out.println("INCERTANDO PERSON = " + person.getFirstName());
        System.out.println("OBTENIENDO PERSON = " + personresult.getFirstName() + " | " + personresult.getLastName());
    }
}
