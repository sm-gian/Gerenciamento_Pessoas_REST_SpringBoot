package one.digital.innovation.personapi.service;

import one.digital.innovation.personapi.dto.MsgResponseDTO;
import one.digital.innovation.personapi.entity.Person;
import one.digital.innovation.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MsgResponseDTO createPerson(Person person){
        Person savedPerson = personRepository.save(person);
        return MsgResponseDTO
                .builder()
                .message("Created person with ID " + savedPerson.getId())
                .build();
    }
}
