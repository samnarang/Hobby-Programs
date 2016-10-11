import java.util.Scanner;
class LinearSort {
   void LinearSort() {
       Scanner sc = new Scanner(System.in);
       int a[] = new int [10];
       for(int z = 0; z<=9 ;z++) {
           System.out.println("enter 10 numbers"); 
           a[z]= sc.nextInt();
        }
        for(int x=0;x<10;x++ )
        System.out.println(a[x]) ; 
        int i,j,temp=0;
        for(i=0;i<10-1;i++)
        { 
            for(j=i+1;j<10;j++)
            {
              if(a[i]>a[j])
              {
                  temp = a[i];
                  a[i] = a[j];
                  a[j] = temp;
                }
            }
        }
        for(int y=0;y<10;y++ )
        System.out.println(a[y]) ; 
    }
}  