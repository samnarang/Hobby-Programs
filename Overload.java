class Overload {
    void perimeter(double r) {
        double p = 2*3.14*r;
        System.out.println("Area of Circle " + p);
    }
    void perimeter(int s) {
        int p = 4*s;
        System.out.println("Area of Square " + p);
    }
    void perimeter(int l,int b) {
        int p = 2*(l+b); 
        System.out.println("Area of Reactange " + p);
    }
    public static void main(String args[]) {
        Overload x = new Overload();
        x.perimeter(10.0);
        x.perimeter(4);
        x.perimeter(2,3);
    }
}