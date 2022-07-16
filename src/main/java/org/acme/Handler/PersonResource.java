package org.acme.Handler;

import org.acme.Model.Person;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;

public interface PersonResource extends PanacheEntityResource<Person, Long>{
    
}
