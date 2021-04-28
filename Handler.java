package homework7;

public class Handler {

    void printShapeName(Shape shape) {
        System.out.println(shape.getName());
    }

    void printShapeId(Shape shape) {
        System.out.println(shape.getId());
    }

    void drawObject(Shape source) {
        source.drawNewObject();
        System.out.println("============");
    }

}
