import java.io.*;
class Employee2 {
    int pan;
    double taxincome,tax;
    String name;
    void input()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Name Of Employee");
        name = br.readLine();
        System.out.println("Enter Personal Account Number");
        pan = Integer.parseInt(br.readLine());
        System.out.println("Enter Taxable Income");
        taxincome = Double.parseDouble(br.readLine());
    }
    void cal() {
        if(taxincome<=100000) 
        tax = 0;
        else if(taxincome>100000&&taxincome<=150000)
        tax = (taxincome-100000)/10;
        else if(taxincome>150000&&taxincome<=250000)
        tax = 5000+(taxincome-150000)/5;
        else
        tax = 25000+((taxincome-250000)*3)/10;
    }
    void display() {
        System.out.println("Name = "+name);
        System.out.println("Personal Account Number = "+pan);
        System.out.println("Taxable Income = "+taxincome);
        System.out.println("Tax = "+tax);
    }
}