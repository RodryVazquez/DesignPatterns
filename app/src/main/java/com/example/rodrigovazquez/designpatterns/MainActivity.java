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
import com.example.rodrigovazquez.designpatterns.Structural.DecoratorPattern.BigSandwich;
import com.example.rodrigovazquez.designpatterns.Structural.DecoratorPattern.ConcreteDecorators.BagetteDecorator;
import com.example.rodrigovazquez.designpatterns.Structural.DecoratorPattern.ExampleTwo.Components.BaseCPU;
import com.example.rodrigovazquez.designpatterns.Structural.DecoratorPattern.ExampleTwo.ConcreteComponents.BasicPc;
import com.example.rodrigovazquez.designpatterns.Structural.DecoratorPattern.ExampleTwo.ConcreteDecorators.GamerFanDecorator;
import com.example.rodrigovazquez.designpatterns.Structural.DecoratorPattern.ExampleTwo.ConcreteDecorators.GamerRamDecorator;
import com.example.rodrigovazquez.designpatterns.Structural.DecoratorPattern.Sandwich;
import com.example.rodrigovazquez.designpatterns.Structural.DecoratorPattern.SimpleSandwich;
import com.example.rodrigovazquez.designpatterns.Structural.AdapterPattern.ExampleOne.Employee;
import com.example.rodrigovazquez.designpatterns.Structural.AdapterPattern.ExampleOne.EmployeeService;
import com.example.rodrigovazquez.designpatterns.Structural.AdapterPattern.ExampleTwo.AudioPlayer;
import com.example.rodrigovazquez.designpatterns.Structural.Facade.ServiceMaker;
import com.example.rodrigovazquez.designpatterns.Structural.Proxy.HttpProxyElement;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

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

        /***********************************/

        BaseCPU baseCPU = new BasicPc();
        System.out.println("Base price basic PC " + baseCPU.basePrice());
        System.out.println("Base price basic PC Policy " + baseCPU.priceBasePolicy());

        GamerFanDecorator gamerFanDecorator = new GamerFanDecorator(baseCPU);
        System.out.println("Price with new Fan " + gamerFanDecorator.getNewPrice());

        GamerRamDecorator gamerRamDecorator = new GamerRamDecorator(baseCPU);
        System.out.println("Price with new Ram " + gamerRamDecorator.getNewPrice());

        GamerRamDecorator fullDecorator = new GamerRamDecorator(gamerFanDecorator);
        System.out.println("Complete price " + fullDecorator.basePrice());

        /********************* FACADE **************************/

        ServiceMaker serviceMaker = new ServiceMaker();
        serviceMaker.openStudentConnection();
        System.out.println("" + serviceMaker.getStudentData());

        serviceMaker.openTeacherConnection();
        System.out.println("" + serviceMaker.getTeacherData());

        /************************ PROXY ******************************/

        HttpProxyElement proxyElement = new HttpProxyElement();
        proxyElement.Request();

        /************** DEMO ********************/
        QueueDemo(1289);
        StackDemo(1289);
    }

    /**
     * First-In Fist-Out FIFO
     * Primero en entrar primero en salir
     * @param size
     */
    public void QueueDemo(int size){

        Queue<String> stringQueue = new LinkedList<>();

        //Agrega un elemento a la cola
        boolean isAdded = stringQueue.add("Demo 1");
        stringQueue.add("Demo 2");
        stringQueue.add("Demo 3");
        stringQueue.add("Demo 4");
        stringQueue.add("Demo 5");

        //Elemento actual de la cola
        String currentQueue = stringQueue.element();

        //Remueve el primer elemento
        stringQueue.remove();

        //Remueve y retorna el primer elemento
        String getAndRemoveQueue = stringQueue.poll();

        //Retorna el primer elemento
        String getCurrentQueue = stringQueue.peek();

        //Indica si la cola esta vacia
        boolean isEmty = stringQueue.isEmpty();
    }

    /**
     * Last-In Last-Out LIFO
     * Ultimo en entrar primero en salir
     * @param size
     */
    public void StackDemo(int size) {

        //Creamos la pila
        Stack<String> stringStack = new Stack<>();
        //Introduce un elemento en la pila
        stringStack.push("Demo 1");
        stringStack.push("Demo 2");
        stringStack.push("Demo 3");
        //Saca un elemento de la pila
        String element = stringStack.pop();
        //Consulta el primer elemento de la cima
        String lastInElement = stringStack.peek();

        //Comprueba si la pila esta vacia
        boolean isEmpty = stringStack.isEmpty();
    }
}
