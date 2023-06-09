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
    public int compareTo(Home another) {
        if (this.getArea() > another.getArea()) {
            return 1;
        } else if (this.getArea() < another.getArea()) {
            return -1;
        }else {
            return 0;
    }
            @Override
        public String toString() {
            return "Квартира площадью " + getArea() + " метров на " + floor + " этаже";
        }
    }
}
// END
