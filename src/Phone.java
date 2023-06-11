public abstract class Phone implements Printable {
    private int year;
    private int memory;
    private String country;

    public int getYear() {
        return year;
    }

    public int getMemory() {
        return memory;
    }

    public String getCountry() {
        return country;
    }

    public Phone(int year, int memory, String country) {
        this.year = year;
        this.memory = memory;
        this.country = country;
    }
}
