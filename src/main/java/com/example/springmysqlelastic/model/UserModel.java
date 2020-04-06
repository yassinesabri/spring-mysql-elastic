package com.example.springmysqlelastic.model;

import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;

@Document(indexName = "user")
public class UserModel {
    private Long id;
    private String firstName;
    private String lastName;
    private Date modificationDate;

    public UserModel() {
        // do nothing
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Date getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }
}
