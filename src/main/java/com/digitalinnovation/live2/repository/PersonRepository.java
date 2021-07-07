package com.digitalinnovation.live2.repository;

import com.digitalinnovation.live2.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
