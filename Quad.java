package homework7;

public class Quad extends Shape {

    Quad(String name) {
        super(name);
    }

    @Override
    public void drawNewObject() {
        System.out.println("Drawing a Quad");
    }
}
