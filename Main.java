package homework7;

public class Main {
    public static void main(String[] args) {

        Shape[] allShapes = new Shape[6];


        allShapes[0] = new Quad("Just a Quad");
        allShapes[1] = new Square("Black Square, by Malevich",7);
        allShapes[2]= new Rectangle("My Rectangle",7,5);
        allShapes[3] = new Oval("Oval mirror",17,25);
        allShapes[4] = new Oval(17,25);
        allShapes[5] = new Circle("Big Red Circle",5);


        Handler handler = new Handler();

        for (Shape shape : allShapes) {
            if (shape.hasName()) handler.printShapeName(shape);
            handler.drawObject(shape);
        }

        allShapes[4].setName("Let it be new name");

        handler.printShapeName(allShapes[4]);

    }
}
