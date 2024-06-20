package abstractfactory.products;

public class LowEndTablet implements Tablet {
    @Override
    public void displayDetails() {
        System.out.println("Low-End Tablet");
    }

    @Override
    public void playVideo() {
        System.out.println("Playing video on low-end tablet");
    }

    @Override
    public void drawWithPencil() {
        System.out.println("Drawing with pencil on low-end tablet");
    }
}