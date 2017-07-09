package com.example.rodrigovazquez.designpatterns.Structural.Proxy;

/**
 * Created by RodryVazquez on 09/07/17.
 */

public class HttpElement implements HttpProtocol {

    //Procesa una operacion costosa al inicializar el objeto
    public HttpElement(){
          processImageToSend();
    }

    @Override
    public void Request() {
        System.out.println("The image is sending...");
    }

    private void processImageToSend(){
        System.out.println("Process Image.....");
    }
}
