import java.io.*;
class BinarySearch {
public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Length of The Array");
        int z = Integer.parseInt(br.readLine());
        System.out.println("Enter Number To Be Searched");
        int a = Integer.parseInt(br.readLine());
        int b[] = new int[z];
        int min=0,max=z-1,mid=0;
        boolean flg=false;
        System.out.println("Enter "+z+" Numbers");
        for(int i=0;i<b.length;i++) {
            b[i] = Integer.parseInt(br.readLine());
        }
        while(min<=max) {
            mid=(min+max)/2;
            if(b[mid]==a) {
                flg=true;
                break;
            }
            else if(a>mid)
            min=mid+1;
            else 
            max=mid-1;
        }
    
    if(flg==true)
        System.out.println(a+" Found at Index Number "+mid);
    else
        System.out.println("Not Found");
    }
}
    