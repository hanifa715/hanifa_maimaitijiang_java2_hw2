public class Xiaomi extends Phone{
    private double mainScreenSize;
    private String screenResolution;

    public Xiaomi(int year, int memory, String country, double mainScreenSize, String screenResolution) {
        super(year, memory, country);
        this.mainScreenSize = mainScreenSize;
        this.screenResolution = screenResolution;
    }

    @Override
    public void print() {
        System.out.println("Xiaomi " +
                "\nYear: " + getYear() +
                "\nMemory: " + getMemory() +
                "\nCountry: " + getCountry() +
                "\nMain Screen Size: " + mainScreenSize +
                "\nScreen Resolution: " + screenResolution);
    }
}
