import java.io.*;
class CallCharges {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter Number of Calls");
        int a = Integer.parseInt(br.readLine()); 
        double amt = 0;
        if(a <= 50)
            amt = 0;
        else if(a>50 && a<=150)
            amt = (a-50)*1;
        else if(a>150 && a<=350)
            amt = 100*1 + (a-150)*0.9;
        else if(a>350)
            amt = 100*1 + 200*0.9 + (a-350)*0.8;
        System.out.println("Number of Calls = " + a);     
        System.out.println("Charges = " + amt);
        System.out.println("Total Amount = " + (amt+180)); 
        
        }
}