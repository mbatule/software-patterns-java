package abstractfactory.factories;

import abstractfactory.products.*;

public class MidRangeFactory implements ElectronicFactory {
    @Override
    public Smartphone createSmartphone() {
        return new MidRangeSmartphone();
    }

    @Override
    public Laptop createLaptop() {
        return new MidRangeLaptop();
    }

    @Override
    public Tablet createTablet() {
        return new MidRangeTablet();
    }
}
