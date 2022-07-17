package org.acme.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class PersonDto {

    @NotNull
    private String name;

    private Integer age;

    private Long cpf;

    @Email
    private String email;

}
