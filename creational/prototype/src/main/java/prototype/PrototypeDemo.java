package prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        // Registrar prototipos de formas
        Shape circlePrototype = new Circle(5.0);
        ShapeRegistry.registerShape(ShapeType.CIRCLE, circlePrototype);

        Shape rectanglePrototype = new Rectangle(10.0, 4.0);
        ShapeRegistry.registerShape(ShapeType.RECTANGLE, rectanglePrototype);

        // Crear nuevas formas clonando los prototipos
        Shape circle1 = ShapeRegistry.createShape(ShapeType.CIRCLE);
        Shape rectangle1 = ShapeRegistry.createShape(ShapeType.RECTANGLE);

        circle1.draw();
        System.out.println("Area of circle1: " + circle1.getArea());

        rectangle1.draw();
        System.out.println("Area of rectangle1: " + rectangle1.getArea());
    }
}
