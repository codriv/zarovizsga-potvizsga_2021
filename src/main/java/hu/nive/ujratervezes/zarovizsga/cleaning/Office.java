package hu.nive.ujratervezes.zarovizsga.cleaning;

public class Office implements Cleanable{

    private String address;
    private int area;
    private int levels;
    private final int COST = 100;

    public Office(String address, int area, int levels) {
        this.address = address;
        this.area = area;
        this.levels = levels;
    }

    @Override
    public int clean() {
        return area * levels * COST;
    }

    @Override
    public String getAddress() {
        return address;
    }
}
