import java.io.*;
class Cirle {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter Radius of Circle");
        double r = Double.parseDouble(br.readLine());
        double area = 3.14*r*r;
        System.out.println("Area of Circle = "+area);
    }
}
