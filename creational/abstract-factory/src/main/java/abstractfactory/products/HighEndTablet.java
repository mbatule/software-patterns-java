package abstractfactory.products;

public class HighEndTablet implements Tablet {
    @Override
    public void displayDetails() {
        System.out.println("High-End Tablet");
    }

    @Override
    public void playVideo() {
        System.out.println("Playing video on high-end tablet");
    }

    @Override
    public void drawWithPencil() {
        System.out.println("Drawing with pencil on high-end tablet");
    }
}