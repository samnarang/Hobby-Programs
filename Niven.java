import java.io.*;
class Niven {
public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Number");
        int a = Integer.parseInt(br.readLine());
        int i,sum=0,copy=a;
        while(a>0) {
            int z=a%10;
            sum+=z;
            a/=10;
        }
        if(copy%sum==0)
            System.out.println("Niven Number");
        else
            System.out.println("Not a Niven Number");
        }
    }