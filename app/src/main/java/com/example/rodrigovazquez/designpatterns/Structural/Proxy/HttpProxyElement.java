package com.example.rodrigovazquez.designpatterns.Structural.Proxy;

/**
 * Created by RodryVazquez on 09/07/17.
 */

public class HttpProxyElement implements HttpProtocol {

    //Referencia al otro elemento
    private HttpElement httpElement;

    @Override
    public void Request() {
        if(true){
            httpElement = new HttpElement();
            httpElement.Request();
        }else{
            System.out.println("Dont have permissions");
        }
    }
}
