package abstractfactory.products;

public class HighEndLaptop implements Laptop {
    @Override
    public void displayDetails() {
        System.out.println("High-End Laptop");
    }

    @Override
    public void openOfficeApp() {
        System.out.println("Opening office app on high-end laptop");
    }

    @Override
    public void connectToInternet() {
        System.out.println("Connecting to internet with high-end laptop");
    }
}