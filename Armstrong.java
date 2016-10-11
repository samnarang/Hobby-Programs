import java.io.*;
class Armstrong {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter a Number");
        int a = Integer.parseInt(br.readLine());
        int i,sum=0,copy=a,r;
        i=0;
        while(a>0){
            r=a%10;
            sum+=r*r*r;
            a/=10;
        }
        if(sum==copy)
        System.out.println("The Number "+copy+" is an Armstrong Number");
        else
        System.out.println("The Number "+copy+" is Not Armstrong Number");
}
}