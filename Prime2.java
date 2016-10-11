import java.io.*;
class Prime2 {
    void CheckPrime(int a) {
        int cnt=0,i;
        for(i=1;i<=a;i++) {
            if(a%i==0)
            cnt++;
        }
        if(cnt==2)
        System.out.println("The Number: "+ a +" is a Prime Number");
        else if(cnt==1)
        System.out.println("The Number: "+ a +" is a Unique Number");
        else
        System.out.println("The Number: "+ a +" is a Composite Number");
    }
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter a Number");
        int a = Integer.parseInt(br.readLine());
        Prime2 x = new Prime2();
        x.CheckPrime(a);
    }
}