package prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeRegistry {
    private static final Map<ShapeType, Shape> shapePrototypes = new HashMap<>();

    public static void registerShape(ShapeType type, Shape prototype) {
        shapePrototypes.put(type, prototype);
    }

    public static Shape createShape(ShapeType type) {
        Shape prototype = shapePrototypes.get(type);
        if (prototype == null) {
            throw new IllegalArgumentException("Shape type not registered: " + type);
        }
        try {
            return prototype.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Failed to clone shape", e);
        }
    }
}
