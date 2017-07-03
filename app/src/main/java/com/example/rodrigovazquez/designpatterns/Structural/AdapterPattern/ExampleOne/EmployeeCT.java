package com.example.rodrigovazquez.designpatterns.Structural.AdapterPattern.ExampleOne;

/**
 * Created by Rodrigo Vazquez on 02/07/2017.
 */

public class EmployeeCT {

    private String id;
    private String name;
    private String lastName;
    private String email;
    private String country;
    private String postalCode;

    public EmployeeCT(String id, String name, String lastName, String email, String country, String postalCode) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.country = country;
        this.postalCode = postalCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
