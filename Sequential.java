import java.util.Scanner;
class Sequential {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int a[] = new int [10];
        for(int z = 0; z<=9 ;z++) {
            System.out.println("enter 10 numbers"); 
            a[z]= sc.nextInt();
        }
        for(int x=0;x<10;x++ )
            System.out.println(a[x]); 
        int i,j,temp=0;
        for(i=0;i<10-1;i++)
        { 
            int smallest = a[i],pos = i;
            for(j=i+1;j<10;j++)
            {
                if(a[j]<smallest)
                {
                     smallest = a[j];
                     pos = j;
                }
            }
            a[pos] = a[i];
            a[i] = smallest;
        }
        for(int y=0;y<10;y++ )
           System.out.println(a[y]);
    }
}   