package com.demo.spring.data.demo.data;

import com.demo.spring.data.demo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
