import java.io.*;
class EvenOdd {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int a = Integer.parseInt(br.readLine());
        if(a%2==0)
        System.out.println("Number is even");
        else
        System.out.println("Number is odd");
    }
}