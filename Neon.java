import java.io.*;
class Neon {
public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter a Number");
        int a = Integer.parseInt(br.readLine());
        int sq=a*a,sum=0,copy=sq;
        while(sq>0) {
            int r = sq%10;
            sum+=r;
            sq/=10;
        }
        if(sum==copy) 
            System.out.println(a+" is a Neon Number");
        else
            System.out.println(a+" is a Neon Number");
    }
}