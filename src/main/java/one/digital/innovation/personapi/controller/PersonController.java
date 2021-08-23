package one.digital.innovation.personapi.controller;

import one.digital.innovation.personapi.dto.MsgResponseDTO;
import one.digital.innovation.personapi.entity.Person;
import one.digital.innovation.personapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping //operação de criação de usuários
    @ResponseStatus(HttpStatus.CREATED)
    public MsgResponseDTO createPerson(@RequestBody Person person){
        return personService.createPerson(person);
    }
}
