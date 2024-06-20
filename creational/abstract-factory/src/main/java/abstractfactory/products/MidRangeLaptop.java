package abstractfactory.products;

public class MidRangeLaptop implements Laptop {
    @Override
    public void displayDetails() {
        System.out.println("Mid-Range Laptop");
    }

    @Override
    public void openOfficeApp() {
        System.out.println("Opening office app on mid-range laptop");
    }

    @Override
    public void connectToInternet() {
        System.out.println("Connecting to internet with mid-range laptop");
    }
}