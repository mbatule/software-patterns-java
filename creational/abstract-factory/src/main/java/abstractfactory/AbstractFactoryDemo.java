package abstractfactory;

import abstractfactory.factories.ElectronicFactory;
import abstractfactory.products.Laptop;
import abstractfactory.products.Smartphone;
import abstractfactory.products.Tablet;
import abstractfactory.providers.FactoryProvider;

public class AbstractFactoryDemo {

    public static void main(String[] args) {

        //obtener la Factory basado en una condición
        ElectronicFactory factory = FactoryProvider.getFactory("high-end");

        //crear los productos usando Factory
        Smartphone smartphone = factory.createSmartphone();
        Laptop laptop = factory.createLaptop();
        Tablet tablet = factory.createTablet();

        // Utilizar los productos electrónicos creados
        smartphone.displayDetails();
        laptop.displayDetails();
        tablet.displayDetails();
    }
}
