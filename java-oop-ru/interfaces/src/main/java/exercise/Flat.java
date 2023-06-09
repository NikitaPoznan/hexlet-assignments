package exercise;

// BEGIN
public class Flat implements Home {
    private final double area;

    private final int floor;
    private final double balconyArea;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    public double getArea() {
        return area + balconyArea;
    }

    @Override
    public int compareTo() {
        return 0;
    }

    @Override
    public String toString() {
        return "Flat{}";
    }
}
// END
