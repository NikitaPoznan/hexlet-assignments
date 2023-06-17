package exercise;

// BEGIN
class Circle {

    private int radius;

    private Point pointCentre;

    public Circle(Point pointCentre, int radius) {
        this.radius = radius;
        this.pointCentre = pointCentre;
    }

    public int getRadius() {
        return radius;
    }

    public double getSquare() throws NegativeRadiusException{
        if(radius < 0){
            throw new NegativeRadiusException("Радиус не может быть меньше нуля");
        }

        return Math.PI * radius * radius;
    }
}
// END
