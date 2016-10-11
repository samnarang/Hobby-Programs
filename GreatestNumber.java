import java.io.*;
class GreatestNumber {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter 3 numbers");
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine()); 
        int c = Integer.parseInt(br.readLine());
        if(a>b && b>c)
            System.out.println(a+" is greatest");
        else if(b>a  && b>c)
            System.out.println(b+" is greatest");
        else
            System.out.println(c+" is greatest");
    }
}