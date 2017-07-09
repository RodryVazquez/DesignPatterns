package com.example.rodrigovazquez.designpatterns.Structural.Facade;

/**
 * Created by RodryVazquez on 08/07/17.
 */

public interface ConnectionHelper<T,O,P> {

    String URL_Connection = "server IP";

    void OpenConnection();
    T GetAllData();
    O GetDataById(P args);
    void Update(O args);
    void Create(O args);
    void Delete(P args);
}
