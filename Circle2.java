import java.io.*;
class Circle2 {
    double Area(double r) {
        double area = 3.14*r*r;
        return area;
    }
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter Radius of Circle");
        double r = Double.parseDouble(br.readLine());
        Circle2 x=new Circle2();
        System.out.println("Area of Circle = "+x.Area(r));
    }
}
