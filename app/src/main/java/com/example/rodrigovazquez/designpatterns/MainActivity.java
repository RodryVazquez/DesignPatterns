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
import com.example.rodrigovazquez.designpatterns.Structural.AdapterPattern.Employee;
import com.example.rodrigovazquez.designpatterns.Structural.AdapterPattern.EmployeeModel;
import com.example.rodrigovazquez.designpatterns.Structural.AdapterPattern.EmployeeService;

import java.util.List;

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
    }
}
