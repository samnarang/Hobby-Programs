import java.io.*;
class Name {
public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Length of The Array");
        int z = Integer.parseInt(br.readLine());
        String a[]=new String[z];
        String temp;
        System.out.println("Enter "+z+" Names");
        for(int i=0;i<z;i++)
            a[i]=(br.readLine());
            System.out.println("The Names Which Begin and End With 'A' are :");
        for(int i=0;i<z;i++) {
            String s=a[i];
            char ch1=s.charAt(0);
            char ch2=s.charAt(s.length()-1);
            if(ch1=='A'||ch1=='a') {
                if(ch2=='A'||ch2=='a')
                    System.out.println(a[i]);
                }
            }
        }
    }

            
        
            