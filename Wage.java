import java.io.*;
class Wage {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter Number of Working Hours");
        int a = Integer.parseInt(br.readLine()); 
        System.out.println("Enter Per Hour Wage");
        int b = Integer.parseInt(br.readLine());
        double wage;
        if(a<=48)
            wage = a*b;
        else if(a>48 && a<=56)
            wage = 48*b + (a-48)*b*1.25;
        else 
            wage = 48*b + 8*b*1.25 + (a-56)*b*1.5;
        System.out.println("Wage = " + wage);
    }
}
        