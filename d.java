import java.util.Scanner;
class d {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int a[] = new int [10];
        for(int z = 0; z<=9 ;z++) {
            System.out.println("enter 10 numbers"); 
            a[z]= sc.nextInt();
        }
        int i,j,temp;
        for(i=0;i<10-1;i++)
        {
            for(j=0;j<10-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for (int x=0;x<10;x++)
        System.out.println(a[x]);
    } 
}    