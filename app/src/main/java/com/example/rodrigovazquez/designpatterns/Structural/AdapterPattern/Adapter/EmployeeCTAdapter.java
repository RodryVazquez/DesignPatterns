package com.example.rodrigovazquez.designpatterns.Structural.AdapterPattern.Adapter;

import com.example.rodrigovazquez.designpatterns.Structural.AdapterPattern.Employee;
import com.example.rodrigovazquez.designpatterns.Structural.AdapterPattern.EmployeeCT;

/**
 * Created by Rodrigo Vazquez on 02/07/2017.
 */

public class EmployeeCTAdapter implements Employee {

    private EmployeeCT instance;

    public EmployeeCTAdapter(EmployeeCT instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getId();
    }

    @Override
    public String getFirstName() {
        return instance.getName();
    }

    @Override
    public String getLastName() {
        return instance.getLastName();
    }

    @Override
    public String getEmail() {
        return instance.getEmail();
    }

    @Override
    public String Country() {
        return instance.getCountry();
    }

    @Override
    public int PostalCode() {
        return Integer.valueOf(instance.getPostalCode());
    }

    @Override
    public String Street() {
        return "NA";
    }
}
