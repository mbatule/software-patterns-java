package abstractfactory.factories;

import abstractfactory.products.*;

public class LowEndFactory implements ElectronicFactory {
    @Override
    public Smartphone createSmartphone() {
        return new LowEndSmartphone();
    }

    @Override
    public Laptop createLaptop() {
        return new LowEndLaptop();
    }

    @Override
    public Tablet createTablet() {
        return new LowEndTablet();
    }
}