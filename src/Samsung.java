public class Samsung extends Phone{
    private String touchID;
    private int weight;

    public Samsung(int year, int memory,String country, String touchID, int weight) {
        super(year, memory, country);
        this.touchID = touchID;
        this.weight = weight;
    }

    @Override
    public void print() {
        System.out.println("Samsung " +
                "\nYear: " + getYear() +
                "\nMemory: " + getMemory() +
                "\nCountry: " + getCountry() +
                "\nTouch ID: " + touchID +
                "\nWeight: " + weight);

    }
}
