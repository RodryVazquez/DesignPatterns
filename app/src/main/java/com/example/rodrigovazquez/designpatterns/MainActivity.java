package com.example.rodrigovazquez.designpatterns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.rodrigovazquez.designpatterns.AbstractFactoryPattern.AbstractFactory;
import com.example.rodrigovazquez.designpatterns.AbstractFactoryPattern.Car;
import com.example.rodrigovazquez.designpatterns.AbstractFactoryPattern.Enums.BrandType;
import com.example.rodrigovazquez.designpatterns.AbstractFactoryPattern.Enums.FactoryType;
import com.example.rodrigovazquez.designpatterns.AbstractFactoryPattern.FactoryProducer;
import com.example.rodrigovazquez.designpatterns.BuilderPattern.LaunchOrderTele;
import com.example.rodrigovazquez.designpatterns.FactoryPattern.Enums.WebsiteType;
import com.example.rodrigovazquez.designpatterns.FactoryPattern.Factory.WebsiteFactory;
import com.example.rodrigovazquez.designpatterns.FactoryPattern.Website;
import com.example.rodrigovazquez.designpatterns.Singlenton.DbSinglenton;

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
    }
}
