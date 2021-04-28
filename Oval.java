package homework7;

public class Oval extends Shape{
    private int horizontalAxisLength;
    private int verticalAxisLength;

    Oval(String name, int horizontalAxisLength, int verticalAxisLength) {
        super(name);
        this.horizontalAxisLength = horizontalAxisLength;
        this.verticalAxisLength = verticalAxisLength;
    }

    Oval(int horizontalAxisLength, int verticalAxisLength) {
        super();
        this.horizontalAxisLength = horizontalAxisLength;
        this.verticalAxisLength = verticalAxisLength;
    }

    @Override
    public void drawNewObject() {
        System.out.println("Drawing an Oval");
    }
}
