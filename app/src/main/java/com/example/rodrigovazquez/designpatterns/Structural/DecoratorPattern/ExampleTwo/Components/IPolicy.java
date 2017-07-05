package com.example.rodrigovazquez.designpatterns.Structural.DecoratorPattern.ExampleTwo.Components;

/**
 * Interfaz que se implementa en el componente principal
 * agrega funcionalidad por defecto
 */

public interface IPolicy {

    String codeFeature = "123456789";

    String priceBasePolicy();
}
