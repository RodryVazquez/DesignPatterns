package com.example.rodrigovazquez.designpatterns.Structural.Facade;

/**
 * Created by RodryVazquez on 08/07/17.
 */

public class Teacher implements ConnectionHelper<String, String, Integer> {

    @Override
    public void OpenConnection() {
        System.out.println("Simulate connection for Teacher " + URL_Connection);
    }

    @Override
    public String GetAllData() {
        return "Simulate get all data for Teachers";
    }

    @Override
    public String GetDataById(Integer args) {
        return getElement(args);
    }

    @Override
    public void Update(String args) {
        System.out.println("Simulate update Teacher");
    }

    @Override
    public void Create(String args) {
        System.out.println("Simulate create Teacher");
    }

    @Override
    public void Delete(Integer args) {
        System.out.println("Simulate delete Teacher");
    }

    private String getElement(int param){
        String[] dataSet = {"Teacher Pablo","Miss Kriss","Teacher Many"};
        try{
            return dataSet[param];
        }catch (ArrayIndexOutOfBoundsException ex){
            return "The Teacher not exist";
        }
    }
}
