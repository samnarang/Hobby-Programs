import java.io.*;
class Magic {
public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Number");
        int a = Integer.parseInt(br.readLine());
        int sum=a,r;
        while(sum>9) {
            a=sum;
            sum=0;
            while(a>0) {
                r=a%10;
                sum+=r;
                a/=10;
            }
        }
        if(sum==1) 
            System.out.println("Magic Number");
        else
            System.out.println("Not a Magic Number");
        }
    }

            