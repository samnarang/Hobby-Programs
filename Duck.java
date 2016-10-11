import java.io.*;
class Duck {
public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Number");
        int a = Integer.parseInt(br.readLine());
        boolean flg=false;
        int r,i;
        i=0;
        while(a>0) {
            r=a%10;
            if(r==0) {
             flg=true;
             break;
            }
            a/=10;
        }
        if(flg==true) 
        System.out.println("Duck");
        else
        System.out.println("Not Duck");
    }
}