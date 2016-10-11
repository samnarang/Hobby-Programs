import java.io.*;
class PerfectNumber {
public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter a Number");
        int a = Integer.parseInt(br.readLine());
        int sum=0,i;
        for(i=1;i<a;i++) {
            if(a%i==0)
            sum+=i;
        }
        if(sum==a)
        System.out.println("The Number: "+ a + " is a Perfect Number");
        else
        System.out.println("The Number: "+ a + " is a Not Perfect Number");
    }
}