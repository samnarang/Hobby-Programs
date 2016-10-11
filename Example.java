import java.util.Scanner;
class Example {
    Scanner sc = new Scanner(System.in);
    int a[] = new int[10];
    int linearSearch() {
        int cnt = 0;
        System.out.println("Enter number to be searched");
        int z = sc.nextInt();
        for(int i=0;i<10;i++)
        {
            if(z==a[i])
            cnt++;
        }      
        return cnt;
    }
    void LinearSort() {
        int i,j,temp = 0;
        for(i=0;i<10-1;i++)
        { 
            for(j=i+1;j<10;j++)
            {
              if(a[i]>a[j])
              {
                  a[i] = temp;
                  a[i] = a[j];
                  a[j] = temp;
                }
              System.out.println(a) ; 
            }
        }
    }
    void print() {
        int cnt=0;
        if(cnt!=0) 
        System.out.println("search succesful , number found" + cnt + "times");
        else
        System.out.println("search unsuccesful");
    }
    
    
}