import java.io.*;
class SevenWonders {
public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Name of a Country");
        String x = (br.readLine());         
        String a[] ={"Chichen Itza","Christ the Redeemer","Taj Mahal","Great Wall of China","Machu Picchu","Petra","Colosseum"};
        String b[] = {"Mexico","Brazil","India","China","Peru","Jordan","Italy"};
        boolean flag=false;
        for(int i=0;i<=6;i++) {
            if(b[i].equalsIgnoreCase(x)) {
            System.out.println(b[i]+" - "+a[i]);
            flag=true;
        }
        }
        if(flag==false)
        System.out.println(x+" - Sorry Not Found!");
    }
}