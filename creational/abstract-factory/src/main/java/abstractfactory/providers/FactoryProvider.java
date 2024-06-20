package abstractfactory.providers;

import abstractfactory.factories.ElectronicFactory;
import abstractfactory.factories.HighEndFactory;
import abstractfactory.factories.LowEndFactory;
import abstractfactory.factories.MidRangeFactory;

public class FactoryProvider {
    public static ElectronicFactory getFactory(String condition) {
        if ("high-end".equalsIgnoreCase(condition)) {
            return new HighEndFactory();
        } else if ("mid-range".equalsIgnoreCase(condition)) {
            return new MidRangeFactory();
        } else if ("low-end".equalsIgnoreCase(condition)) {
            return new LowEndFactory();
        } else {
            throw new IllegalArgumentException("Invalid condition for factory selection");
        }
    }
}
