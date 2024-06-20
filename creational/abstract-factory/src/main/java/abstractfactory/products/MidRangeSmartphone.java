package abstractfactory.products;

public class MidRangeSmartphone implements Smartphone {
    @Override
    public void displayDetails() {
        System.out.println("Mid-Range Smartphone");
    }

    @Override
    public void makeCall() {
        System.out.println("Making call with mid-range smartphone");
    }

    @Override
    public void sendMessage() {
        System.out.println("Sending message with mid-range smartphone");
    }
}