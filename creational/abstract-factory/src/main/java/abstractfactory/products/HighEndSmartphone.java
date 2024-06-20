package abstractfactory.products;

public class HighEndSmartphone implements Smartphone {
    @Override
    public void displayDetails() {
        System.out.println("High-End Smartphone");
    }

    @Override
    public void makeCall() {
        System.out.println("Making call with high-end smartphone");
    }

    @Override
    public void sendMessage() {
        System.out.println("Sending message with high-end smartphone");
    }
}
