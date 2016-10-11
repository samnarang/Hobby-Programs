import java.util.Scanner;
class e {
    public static void main(int v) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int [10];
        for(int z = 0; z<=9 ;z++) {
            System.out.println("enter 10 numbers"); 
            a[z]= sc.nextInt();
         }
         int first = 0,last = a.length-1,mid;
         boolean flg = false;
         while (first <=last)
        {
            mid = (first+last)/2;
            if(v>a[mid])
            {
                first = mid+1;
            }
            else if(v<a[mid])
            {
                last = mid-1;
            }
            else
            {
                System.out.println("search successful");
                flg = true;
                break;
            }
        }
        if(!flg)
        System.out.println("not found");
    }
}
   