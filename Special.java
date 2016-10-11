import java.io.*;
class Special {
public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Number");
        int a = Integer.parseInt(br.readLine());
        int i,sum=0,copy=a;
        while(a>0) {
            int z=a%10;
            int f=1;
        for(i=1;i<=z;i++) 
            f*=i;
            a/=10;
            sum+=f;
        }
        if(sum==copy)
            System.out.println("Special Number");
        else
            System.out.println("Not a Special Number");
        }
    }
    