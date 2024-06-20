package abstractfactory.factories;

import abstractfactory.products.*;

public class HighEndFactory implements ElectronicFactory {
    @Override
    public Smartphone createSmartphone() {
        return new HighEndSmartphone();
    }

    @Override
    public Laptop createLaptop() {
        return new HighEndLaptop();
    }

    @Override
    public Tablet createTablet() {
        return new HighEndTablet();
    }
}