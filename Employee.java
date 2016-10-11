import java.io.*;
class Employee {
    double empno,basic,hra,da,net,pf,gross;
    String name;
    void accept()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Employee Number");
        empno=Double.parseDouble(br.readLine());
        System.out.println("Enter Basic Income");
        basic=Double.parseDouble(br.readLine());
        System.out.println("Enter Name Of Employee");
        name=br.readLine();
    }
    void calc() {
        hra=(0.2)*basic;
        da=(0.25)*basic;
        net=basic+hra+da;
        pf=(net*3)/20;
        gross=net-pf;
    }
    void display()throws IOException {
        System.out.println("Name Of Employee = "+name);
        System.out.println("Employee Number = "+empno);
        System.out.println("Basic Income = "+basic);
        System.out.println("Home Rent Allowance = "+hra);
        System.out.println("Dearness Allowance = "+da);
        System.out.println("Net Income = "+net);
        System.out.println("Provident Fund = "+pf);
        System.out.println("Gross Income = "+gross);
    }
}