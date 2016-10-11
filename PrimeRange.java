
class PrimeRange {
public static void main(String args[]) {
 for(int a=2;a<=100;a++) {
        int cnt=0,i;
       for(i=1;i<=a;i++) {
            if(a%i==0)
            cnt++;
        }
        if(cnt==2)
        System.out.print(a+"  ");
        
    }
}
}