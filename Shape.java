package homework7;

public abstract class Shape implements Nameable {

    private static int availableID;
    private final int id;
    private String name;

    Shape() {
        this.id = availableID;
        availableID++;
    }

    Shape(String name) {
        this();
        this.name = name;
    }

    public String getName() {
        return hasName() ? this.name : null;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {

        this.name = name;
    }

    @Override
    public boolean hasName() {
        return name != null;  // правильную проверку на null не помню, пересмотрю лекции на эту тему
    }

    public abstract void drawNewObject();    // тут пусть наследники уже переопределяют, как они будут "отрисовываться"


}

