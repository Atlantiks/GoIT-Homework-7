package homework7;

public class Circle extends Shape {
    private int radius;

    Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    Circle(int radius) {
        super();
        this.radius = radius;
    }

    @Override
    public void drawNewObject() {
        System.out.println("Drawing a Circle");
    }
}
