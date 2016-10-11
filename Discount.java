import java.io.*;
class Discount {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter Cost of Purchased Items");
        int a = Integer.parseInt(br.readLine());
        double sp = 0;
        if(a<2000) 
            sp = (5*a)/100;
        else if(a>2000 && a<=5000) 
            sp = (25*a)/100;
        else if(a>5000 && a<=10000)
            sp = (35*a)/100;
        else if(a>10000)
            sp = (50*a)/100;
        System.out.println("Discount = " + sp);
        System.out.println("amount = " + (a-sp));
    }
}