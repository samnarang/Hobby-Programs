import java.io.*;
class Calculator {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter 2 Numbers");
        int a = Integer.parseInt(br.readLine()); 
        int b = Integer.parseInt(br.readLine());
        System.out.println("+----------MENU----------+");
        System.out.println("| 1: for Addition        |");
        System.out.println("+------------------------+");
        System.out.println("| 2: for Subtraction     |");
        System.out.println("+------------------------+");
        System.out.println("| 3: for Multiplication  |");
        System.out.println("+------------------------+");
        System.out.println("| 4: for Division        |");
        System.out.println("+------------------------+");
        System.out.println("| 5: for Remainder       |");
        System.out.println("+------------------------+");
        int c = Integer.parseInt(br.readLine());
        switch(c) {
            case 1 : System.out.println("Addition = " + (a+b));
                     break;
            case 2 : System.out.println("Subtraction = " + (a-b));
                     break;
            case 3 : System.out.println("Multiplication = " + (a*b));
                     break;
            case 4 : System.out.println("Division = " + (a/b));
                     break;
            case 5 : System.out.println("Remainder = " + (a%b));
                     break;
            default : System.out.println("Invalid Number Enter a Number Between 1&4"); 
        }
    }
}
