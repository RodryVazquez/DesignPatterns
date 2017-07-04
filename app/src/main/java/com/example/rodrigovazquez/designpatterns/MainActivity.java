package com.example.rodrigovazquez.designpatterns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.rodrigovazquez.designpatterns.Creational.AbstractFactoryPattern.AbstractFactory;
import com.example.rodrigovazquez.designpatterns.Creational.AbstractFactoryPattern.Car;
import com.example.rodrigovazquez.designpatterns.Creational.AbstractFactoryPattern.Enums.BrandType;
import com.example.rodrigovazquez.designpatterns.Creational.AbstractFactoryPattern.Enums.FactoryType;
import com.example.rodrigovazquez.designpatterns.Creational.AbstractFactoryPattern.FactoryProducer;
import com.example.rodrigovazquez.designpatterns.Creational.BuilderPattern.LaunchOrderTele;
import com.example.rodrigovazquez.designpatterns.Creational.FactoryPattern.Enums.WebsiteType;
import com.example.rodrigovazquez.designpatterns.Creational.FactoryPattern.Factory.WebsiteFactory;
import com.example.rodrigovazquez.designpatterns.Creational.FactoryPattern.Website;
import com.example.rodrigovazquez.designpatterns.Creational.Singlenton.DbSinglenton;
import com.example.rodrigovazquez.designpatterns.Structural.AdapterPattern.DecoratorPattern.BigSandwich;
import com.example.rodrigovazquez.designpatterns.Structural.AdapterPattern.DecoratorPattern.ConcreteDecorators.BagetteDecorator;
import com.example.rodrigovazquez.designpatterns.Structural.AdapterPattern.DecoratorPattern.Sandwich;
import com.example.rodrigovazquez.designpatterns.Structural.AdapterPattern.DecoratorPattern.SimpleSandwich;
import com.example.rodrigovazquez.designpatterns.Structural.AdapterPattern.ExampleOne.Employee;
import com.example.rodrigovazquez.designpatterns.Structural.AdapterPattern.ExampleOne.EmployeeService;
import com.example.rodrigovazquez.designpatterns.Structural.AdapterPattern.ExampleTwo.AudioPlayer;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
        /*
            Conceptos de compiladores
            Tipos de errores
            Pasos de compilador
            Arquitectura de micros
            Proyectos
            Desarrollo
            Asm
            Lenguaje
        */
/**
 * Main activity
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /***************** Singleton Pattern  *****************/
        DbSinglenton singlenton = DbSinglenton.getInstance();
        System.out.println(singlenton);

        DbSinglenton otherSingleton = DbSinglenton.getInstance();
        System.out.println(otherSingleton);

        DbSinglenton moreSingleton = DbSinglenton.getInstance();
        System.out.println(moreSingleton.GetCurrentName());
        
        /***************** Builder Pattern  *****************/
        LaunchOrderTele launchOrderTele = new LaunchOrderTele.Builder()
                                                             .setBread("TODO")
                                                             .setCondiments("TODO")
                                                             .setDressing("TODO")
                                                             .setMeat("TODO")
                                                             .Build();

        /******************* Factory Pattern *****************/
        Website blogWebsite = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(blogWebsite.getPages());

        Website shopWebsite = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(shopWebsite.getPages());

        /******************* Abstract Factory Pattern *************/
        AbstractFactory abstractFactory = FactoryProducer.getFactory(FactoryType.CAR);
        Car carType =  abstractFactory.getCarType(BrandType.NEON);
        System.out.println(carType.StartEngine());
        System.out.println(carType.Start());
        System.out.println(carType.Stop());
        System.out.println(carType.getGeneralBrand());
        System.out.println(carType.getFabricationYear());

        /******************** Adapter Pattern *******************/
        EmployeeService service = new EmployeeService();
        List<Employee> ds = service.getEmployeeList();
        System.out.println(ds);

        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.Play(".mp4", "The lost City.mp4");
        audioPlayer.Play(".mp3","Secrets.mp3");
        audioPlayer.Play(".vlc", "Amazing.vlc");

        audioPlayer.Play(".mpeg","If I Knew.mpeg");

        /****************** Decorator Pattern *********************/

        /******** Example ********/
        File file = new File("./output.txt");
        try {
            file.createNewFile();
            OutputStream outputStream = new FileOutputStream(file);
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

            dataOutputStream.writeChars("Decorator Pattern");

            dataOutputStream.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*************************/

        //Simple Sandwich
        Sandwich simpleSandwich = new SimpleSandwich();
        simpleSandwich.make();

        //Big Sandwich
        Sandwich bigSandwich = new BigSandwich();
        bigSandwich.make();

        //Bagette decorator (Simple Sandwich)
        Sandwich bagetteSandwich = new BagetteDecorator(new SimpleSandwich());
        bagetteSandwich.make();

        //Bagette decorator (Big Sandwich)
        Sandwich bagetteBigSandwich = new BagetteDecorator(new BigSandwich());
        bagetteBigSandwich.make();
    }
}
