package org.acme.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

public class PersonDto {

    @NotNull
    private String name;

    private Integer age;

    private Long cpf;

    @Email
    private String email;

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;

    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getCpf() {
        return cpf;

    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;

    }

    public void setEmail(String email) {
        this.email = email;
    }
}
