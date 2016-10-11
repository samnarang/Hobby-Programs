public class Point {
    private double x;
    private double y;
    Point() {
         x = 0;
         y = 0;
    }
    Point(double x1,double y1) {
        x = x1;
        y = y1;
    }
    Point(Point original) {
        x = original.x;
        y = original.y;
    }
    
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x1) {
        x = x1;
    }
    public void setY(double y1) {
        y = y1;
    }
    
    public double distanceFromOrigin() {
        double distance;
        distance = Math.sqrt((x*x) + (y*y));
        return distance;
    }
    public double distanceFrom(Point point) {
        double distance;
        distance = Math.sqrt(((x - point.x) * (x - point.x)) + ((y - point.y) * (y - point.y)));
        return distance;
    }
    public boolean equals(Point point) {
        return (point.x == x && point.y == y);
    }
    
    public static Point midPointOf(Point point1, Point point2) {
        Point midpoint = new Point();
        midpoint.x = (point1.x + point2.x)/2;
        midpoint.y = (point1.y + point2.y)/2;
        return midpoint;
    }
    public static Point divideAt(Point point1, Point point2, double m, double n) {
        Point division_point = new Point();
        division_point.x = ((m * point2.x) + (n * point1.x))/(m + n);
        division_point.y = ((m * point2.y) + (n * point1.y))/(m + n);
        return division_point;
    }
    public static Point divideAt(Point point1, Point point2, double k) {
        return divideAt(point1, point2, k, 1);
    }
    public static Point divideAt(Point point1, Point point2, Fraction frac) {
        return divideAt(point1, point2, frac.getNumerator(), frac.getDenominator());
    }
}