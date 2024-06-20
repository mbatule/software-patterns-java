package abstractfactory.products;

public class LowEndSmartphone implements Smartphone {
    @Override
    public void displayDetails() {
        System.out.println("Low-End Smartphone");
    }

    @Override
    public void makeCall() {
        System.out.println("Making call with low-end smartphone");
    }

    @Override
    public void sendMessage() {
        System.out.println("Sending message with low-end smartphone");
    }
}
