package com.digitalinnovation.live2.controller;

import com.digitalinnovation.live2.dto.request.PersonDTO;
import com.digitalinnovation.live2.dto.response.MessageResponseDTO;
import com.digitalinnovation.live2.repository.PersonRepository;
import com.digitalinnovation.live2.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/v1/people")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody @Valid PersonDTO personDTO){
        return personService.createPerson(personDTO);
    }

    @GetMapping
    public List<PersonDTO> listAll(){
        return personService.listsAll();
    }

}
