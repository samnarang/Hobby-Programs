import java.io.*;
class GreaterNumber2 {
    int Greater(int a,int b) {
        int g = (a>b?a:b);
        return g;
    }
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter 2 numbers");
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        GreaterNumber2 x=new GreaterNumber2();
        System.out.println("Greater Number = " + x.Greater(a,b));
    }
}