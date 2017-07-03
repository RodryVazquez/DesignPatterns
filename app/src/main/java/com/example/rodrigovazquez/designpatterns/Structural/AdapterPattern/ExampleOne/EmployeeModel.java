package com.example.rodrigovazquez.designpatterns.Structural.AdapterPattern.ExampleOne;

/**
 * Created by Rodrigo Vazquez on 02/07/2017.
 */

public class EmployeeModel implements Employee {

    String employeeId;
    String firstName;
    String lastName;
    String email;
    String country;
    int postalCode;
    String street;


    public EmployeeModel(String employeeId, String firstName, String lastName, String email, String country, int postalCode, String street) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.country = country;
        this.postalCode = postalCode;
        this.street = street;
    }

    @Override
    public String getId() {
        return employeeId;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String Country() {
        return country;
    }

    @Override
    public int PostalCode() {
        return postalCode;
    }

    @Override
    public String Street() {
        return street;
    }
}
