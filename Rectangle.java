package homework7;

public class Rectangle extends Shape{
    private int length;
    private int width;
    public Rectangle(String name, int length, int width) {
        super(name);
        this.length=length;
        this.width=width;

    }

    @Override
    public void drawNewObject() {
        System.out.println("Drawing a Rectangle");
    }
}
