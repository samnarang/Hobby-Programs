import java.io.*;
class EvenOdd2 {
    void EvenOdd(int a) {
        if(a%2==0)
        System.out.println("Number is even");
        else
        System.out.println("Number is odd");
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int a = Integer.parseInt(br.readLine());
        EvenOdd2 x = new EvenOdd2();
        x.EvenOdd(a);
    }
}