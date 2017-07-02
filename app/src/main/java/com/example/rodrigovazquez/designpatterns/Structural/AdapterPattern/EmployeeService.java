package com.example.rodrigovazquez.designpatterns.Structural.AdapterPattern;

import com.example.rodrigovazquez.designpatterns.Structural.AdapterPattern.Adapter.EmployeeCTAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rodrigo Vazquez on 02/07/2017.
 */

public class EmployeeService {

    /**
     *
     * @return
     */
    public List<Employee> getEmployeeList(){
        List<Employee> ds = new ArrayList<>();
        EmployeeModel model = new EmployeeModel("1289","Rodrigo","Vazquez","rodrigo.vazquez@delpunto.com","Mexico",31200,"23 y Riva Palacio");
        ds.add(model);
        //Adapter Pattern
        EmployeeCT employeeCT = new EmployeeCT("1288","Cochinilla","Be like","Cochi@gmail.com","Chihuahua","31203");
        ds.add(new EmployeeCTAdapter(employeeCT));
        return ds;
    }
}
