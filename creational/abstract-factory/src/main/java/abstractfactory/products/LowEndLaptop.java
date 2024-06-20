package abstractfactory.products;

public class LowEndLaptop implements Laptop {
    @Override
    public void displayDetails() {
        System.out.println("Low-End Laptop");
    }

    @Override
    public void openOfficeApp() {
        System.out.println("Opening office app on low-end laptop");
    }

    @Override
    public void connectToInternet() {
        System.out.println("Connecting to internet with low-end laptop");
    }
}