import java.io.*;
class SelectionSort {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Length of The Array");
        int z = Integer.parseInt(br.readLine());
        int a[]=new int[z];
        System.out.println("Enter "+z+" Numbers");
        for(int i=0;i<z;i++) 
            a[i]=Integer.parseInt(br.readLine());
        for(int i=0;i<z;i++) {
            int min=i;
            for(int j=i+1;j<z;j++) {
                if((a[j]<a[min])) {
                        int temp=a[i];
                        a[i]=a[min];
                        a[min]=temp;
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