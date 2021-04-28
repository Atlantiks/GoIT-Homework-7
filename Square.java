package homework7;

public class Square extends Shape {
    private int side;

    Square(String name, int side) {
        super(name);
        this.side = side;
    }

    @Override
    public void drawNewObject() {
        System.out.println("Drawing a square");
    }
}
