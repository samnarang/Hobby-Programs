import java.io.*;
class HCF {
public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter 2 Numbers");
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int i,hcf=0;
        for(i=1;i<=(Math.min(a,b));i++) {
            if(a%i==0 && b%i==0)
                hcf=i;
        }
        int lcm = (a*b)/hcf;
        System.out.println("The HCF of "+ a + "&" + b + " = " + hcf);
        System.out.println("The LCM of "+ a + "&" + b + " = " + lcm);
    }
}