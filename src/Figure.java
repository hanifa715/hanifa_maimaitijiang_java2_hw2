public abstract class Figure implements Drawable{
    private String name;

    public String getName() {
        return name;
    }

    public Figure(String name) {
        this.name = name;
    }

    public abstract int calculatePerimeter();
}
