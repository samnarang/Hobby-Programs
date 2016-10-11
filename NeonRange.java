import java.io.*;
class NeonRange {
public static void main(String args[]) {
        int cnt=1;
        for(int a=1;a<=1000;a++){
        long sq=a*a,sum=0;
        while(sq>0) {
            long r = sq%10;
            sum+=r;
            sq/=10;
        }
        if(sum==a) 
            System.out.println("The "+cnt+"st Neon Number is "+a);
            cnt++;
    }
}
}