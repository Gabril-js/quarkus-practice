package org.acme.Service;

import java.util.List;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

import org.acme.Model.Person;
import org.acme.dto.PersonDto;

@ApplicationScoped
public class PersonService {

    public List<Person> listPerson() {
        return Person.listAll();
    }

    @Transactional
    public Person savePerson(PersonDto dto) {

        Person person = new Person();

        person.setName(dto.getName());

        person.setAge(dto.getAge());

        person.setCpf(dto.getCpf());

        person.setEmail(dto.getEmail());

        person.persist();

        return person;
    }

    @Transactional
    public void updatePerson(Long id, PersonDto dto) {

        Person person = new Person();

        Optional<Person> personOp = Person.findByIdOptional(id);

        if (personOp.isEmpty()) {

            throw new NullPointerException("Person not found");
        }

        person = personOp.get();

        person.setName(dto.getName());

        person.setAge(dto.getAge());

        person.setCpf(dto.getCpf());

        person.setEmail(dto.getEmail());

        person.persist();

    }

    @Transactional
    public void removePerson(Long id) {

        Optional<Person> personOp = Person.findByIdOptional(id);

        if (personOp.isEmpty()) {

            throw new NullPointerException("Person not found");
        }

        Person person = personOp.get();

        person.delete();

    }
}
