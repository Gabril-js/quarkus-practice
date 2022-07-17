package org.acme.Repository;

import org.acme.Model.Person;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

public class PersonRepository implements PanacheRepository<Person> {

}
