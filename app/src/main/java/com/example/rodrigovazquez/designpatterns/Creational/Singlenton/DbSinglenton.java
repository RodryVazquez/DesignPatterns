package com.example.rodrigovazquez.designpatterns.Creational.Singlenton;

/**
 * Retorna la misma instancia
 * No es una interface
 * Un solo constructor sin argumentos este debe ser privado
 */

public class DbSinglenton {

    private static DbSinglenton instance = null;

    private DbSinglenton(){}

    public static DbSinglenton getInstance(){
        //Lazy loading
        if(instance == null){
            //Thread Safe
            synchronized (DbSinglenton.class){
                if(instance == null){
                    instance = new DbSinglenton();
                }
            }
        }
        return instance;
    }

    public String GetCurrentName(){
        return new String("Hello");
    }
}
