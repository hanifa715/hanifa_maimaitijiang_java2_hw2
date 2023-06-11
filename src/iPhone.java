public class iPhone extends Phone{
    private String faceID;
    private int Battery;

    public iPhone(int year, int memory, String country, String faceID, int battery) {
        super(year, memory, country);
        this.faceID = faceID;
        Battery = battery;
    }

    @Override
    public void print() {
        System.out.println("iPhone " +
                "\nYear: " + getYear() +
                "\nMemory: " + getMemory() +
                "\nCountry: " + getCountry() +
                "\nFace ID: " + faceID +
                "\nBattery: " + Battery);

    }
}
