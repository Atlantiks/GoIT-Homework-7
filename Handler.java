package homework7;

public class Handler {

    public static void printShapeName(Shape shape) {
        System.out.println(shape.getName());
    }



    public static void printShapeId(Shape shape) {
        System.out.println(shape.getId());
    }

    public static void drawObject(Shape source) {
        source.drawNewObject();
        System.out.println("============");
    }


}
