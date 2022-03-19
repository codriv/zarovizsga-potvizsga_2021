package hu.nive.ujratervezes.zarovizsga.cleaning;

public class House implements Cleanable{

    private String address;
    private int area;
    private final int COST = 80;

    public House(String address, int area) {
        this.address = address;
        this.area = area;
    }

    @Override
    public int clean() {
        return area * COST;
    }

    @Override
    public String getAddress() {
        return address;
    }
}
