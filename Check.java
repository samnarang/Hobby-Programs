import java.io.*;
class Check {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        char x = (char)br.read();
        Boolean b = Character.isLetter('x');
        Boolean c = Character.isDigit('x');
        if(b == true)
            System.out.println("it is a letter");
        else if(c == true)
            System.out.println("it is a digit");
        else
            System.out.println("it is a special character");
    }
}