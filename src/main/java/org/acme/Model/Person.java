package org.acme.Model;

import javax.persistence.Entity;
import javax.validation.constraints.Email;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person extends PanacheEntity {

    private String name;

    private Integer age;

    private Long cpf;

    @Email
    private String email;

}
