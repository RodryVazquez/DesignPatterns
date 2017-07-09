package com.example.rodrigovazquez.designpatterns.Structural.Facade;

/**
 * Created by RodryVazquez on 08/07/17.
 */

public class Student implements ConnectionHelper<String, String, Integer> {

    @Override
    public void OpenConnection() {
        System.out.println("Open the connection for Student " + URL_Connection);
    }

    @Override
    public String GetAllData() {
        return "This is one Student";
    }

    @Override
    public String GetDataById(Integer args) {
        return getElement(args);
    }

    @Override
    public void Update(String args) {
        System.out.println("Simulate Insert " + args);
    }

    @Override
    public void Create(String args) {
        System.out.println("Simulate Create " + args);
    }

    @Override
    public void Delete(Integer args) {
        System.out.println("Simulate to delete " + args);
    }

    private String getElement(int param) {
        String[] dataSet = {"John", "Mario", "Tim"};
        try {
            return dataSet[param];
        } catch (ArrayIndexOutOfBoundsException ex) {
            return "HttpProtocol Not Exist";
        }
    }
}
