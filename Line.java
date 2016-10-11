class Line {
    private double slope;
    private double x_intercept;
    private double y_intercept;
    
    public Line() {
        x_intercept = 0;
        y_intercept = 0;
        slope = 0;
    }
    public Line(Point point1, Point point2) {
        double x1 = point1.getX();
        double x2 = point2.getX();
        double y1 = point1.getY();
        double y2 = point2.getY();
        //TODO: Add checks
        slope = (y2 - y1)/(x2 - x1);
        y_intercept = y1 - slope*x1;
        x_intercept = x1 - y1/slope;
    }
}