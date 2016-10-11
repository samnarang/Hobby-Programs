import java.io.*;
class BubbleSort {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Length of The Array");
        int z = Integer.parseInt(br.readLine());
        String a[]=new String[z];
        String temp;
        System.out.println("Enter "+z+" Names");
        for(int i=0;i<z;i++)
            a[i]=(br.readLine());
        for(int i=0;i<(z-1);i++) {
            for(int j=0;j<(z-1-i);j++) {
                if(a[j].compareTo(a[j+1])>0) {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
       System.out.println("In Ascending Order");
       for(int i=0;i<z;i++)
            System.out.println(a[i]+" ");
       System.out.println("In Descending Order");
       for(int k=(z-1);k>=0;k--)
            System.out.println(a[k]+" ");
    }
}