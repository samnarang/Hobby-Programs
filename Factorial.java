import java.io.*;
class Factorial {
public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter a Number");
        int a = Integer.parseInt(br.readLine());
        int f=1,i;
        for(i=1;i<=a;i++) {
         f*=i;
        }
        System.out.println("The Factorial of "+ a +" is "+ f);
    }
}