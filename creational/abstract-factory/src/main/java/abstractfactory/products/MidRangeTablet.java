package abstractfactory.products;

public class MidRangeTablet implements Tablet {
    @Override
    public void displayDetails() {
        System.out.println("Mid-Range Tablet");
    }

    @Override
    public void playVideo() {
        System.out.println("Playing video on mid-range tablet");
    }

    @Override
    public void drawWithPencil() {
        System.out.println("Drawing with pencil on mid-range tablet");
    }
}