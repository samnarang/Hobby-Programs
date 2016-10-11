class FibonacciSeries {
    public static void main(int n) {
        long a=0,b=1,c;
        System.out.print(a +","+b+",");
        for(int i=3;i<=n;i++) {
            c=a+b;
            System.out.print(c);
            if(i==n)
                break;
            System.out.print(",");
            a=b;
            b=c;
        }
        System.out.print(".");
    }
}
