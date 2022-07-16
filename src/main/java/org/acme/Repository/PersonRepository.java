package org.acme.Repository;

import javax.enterprise.context.ApplicationScoped;

import org.acme.Model.Person;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class PersonRepository implements PanacheRepository<Person>{
    
}
