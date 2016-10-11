import java.io.*;
class Overload2 {
    void area(double r) {
        double p = 3.14*r*r;
        System.out.println("Area of Circle " + p);
    }
    void area(int s) {
        int p = s*s;
        System.out.println("Area of Square " + p);
    }
    void area(int l,int b) {
        int p = l*b; 
        System.out.println("Area of Reactange " + p);
    }
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Overload2 x = new Overload2();
        System.out.println("Enter 1 for Area of Circle");
        System.out.println("Enter 2 for Area of Square");
        System.out.println("Enter 3 for Area of Reactangle");
        int v = Integer.parseInt(br.readLine());
        switch(v) {
            case 1 :System.out.println("Enter Radius of a Circle");
                    double a = Double.parseDouble(br.readLine());
                    x.area(a);
                    break;
            case 2 :System.out.println("Enter Side of a Square");
                    int b = Integer.parseInt(br.readLine());
                    x.area(b);
                    break;
            case 3 :System.out.println("Enter Length & Breadth of a Rectangle");
                    int c = Integer.parseInt(br.readLine());
                    int d = Integer.parseInt(br.readLine());
                    x.area(c,d);
                    break;
            default :System.out.println("Invalid Number");
        }
    }
}