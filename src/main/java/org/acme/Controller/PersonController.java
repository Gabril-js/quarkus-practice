package org.acme.Controller;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.acme.Model.Person;
import org.acme.Service.PersonService;
import org.acme.dto.PersonDto;

@Path("users")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PersonController {

    @Inject
    PersonService service;

    @GET
    public Response listUsers() {
        List<Person> users = service.listPerson();

        return Response.ok(users).build();
    }

    @POST
    public Response savePerson(PersonDto dto) {

        Person person = service.savePerson(dto);

        return Response.ok(person).status(201).build();
    }

    @Path("{id}")
    @PUT
    public Response updatePerson(@PathParam("id") Long id, PersonDto dto) {

        service.updatePerson(id, dto);

        return Response.status(204).build();
    }

    @Path("{id}")
    public Response removePerson(@PathParam("id")Long id){

        service.removePerson(id);

        return Response.status(204).build();
    }


}
