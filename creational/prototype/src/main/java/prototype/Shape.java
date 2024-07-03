package prototype;

public interface Shape extends Cloneable {
    double getArea();
    void draw();
    Shape clone() throws CloneNotSupportedException;
}