package com.dub.bp.domain;

import org.springframework.data.annotation.Id;

/**
 * @author Igor_Strakhov
 */
public class User {

    @Id
    private String idUser;

    private String firstName;

    private String lastName;

    public User() {
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
