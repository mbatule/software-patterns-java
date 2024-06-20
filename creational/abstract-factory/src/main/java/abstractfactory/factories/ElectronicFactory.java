package abstractfactory.factories;

import abstractfactory.products.Laptop;
import abstractfactory.products.Smartphone;
import abstractfactory.products.Tablet;

public interface ElectronicFactory {

    Smartphone createSmartphone();

    Laptop createLaptop();

    Tablet createTablet();

}
