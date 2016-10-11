import java.io.*;
class GreaterNumber {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter 2 numbers");
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int g = (a>b?a:b);
        System.out.println("Greater Number = " + g);
    }
}