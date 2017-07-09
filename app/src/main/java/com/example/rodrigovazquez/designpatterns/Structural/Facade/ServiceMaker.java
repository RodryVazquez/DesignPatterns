package com.example.rodrigovazquez.designpatterns.Structural.Facade;

/**
 * Created by RodryVazquez on 08/07/17.
 */

public class ServiceMaker {

    private ConnectionHelper<String,String,Integer> student;
    private ConnectionHelper<String,String,Integer> teacher;

    public ServiceMaker(){
        student = new Student();
        teacher = new Teacher();
    }

    public void openStudentConnection(){
        student.OpenConnection();
    }

    public String getStudentData(){
        return student.GetAllData();
    }

    public void openTeacherConnection(){
        teacher.OpenConnection();
    }

    public String getTeacherData(){
        return teacher.GetAllData();
    }

    /*
        * 1
        *
        *
        *
        *
        *
        * N Methods
    * */
}
