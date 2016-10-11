import java.io.*;
class LinearSearch {
public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Number To Be Searched");
        int a = Integer.parseInt(br.readLine());
        int b[]=new int[10];
        boolean flag=false;
        System.out.println("Enter 10 Array Elements");
        for(int i=0;i<=9;i++) {
            b[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<=9;i++) {
            if(b[i]==a) {
                System.out.println(a + " Found as the "+i+"th number in the array");
                flag=true;
            }  
        }
        if(flag==false)
            System.out.println("Number not found");
    }
}
        
            