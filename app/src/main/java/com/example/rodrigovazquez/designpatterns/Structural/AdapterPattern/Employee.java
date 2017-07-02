package com.example.rodrigovazquez.designpatterns.Structural.AdapterPattern;

/**
 * Created by Rodrigo Vazquez on 02/07/2017.
 */

public interface Employee extends EmployeeLocation {

    String getId();
    String getFirstName();
    String getLastName();
    String getEmail();

    @Override
    String Country();

    @Override
    int PostalCode();

    @Override
    String Street();
}
