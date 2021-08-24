package one.digital.innovation.personapi.controller;

import one.digital.innovation.personapi.dto.request.PersonDTO;
import one.digital.innovation.personapi.dto.response.MsgResponseDTO;
import one.digital.innovation.personapi.entity.Person;
import one.digital.innovation.personapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping //operação de criação de usuários
    @ResponseStatus(HttpStatus.CREATED)
    public MsgResponseDTO createPerson(@RequestBody @Valid PersonDTO personDTO){
        return personService.createPerson(personDTO);
    }
}
