class ArmstrongRange {
    public static void main(String args[]) {
        int cnt=1;
        for(int x=1;x<=500;x++) {
        int sum=0,a=x,r;
        int i=0;
        while(a>0){
            r=a%10;
            sum+=r*r*r;
            a/=10;
        }
      
        if(sum==x) {
        System.out.println("The "+cnt+"st Armstrong Number is "+x);
        cnt++;
    }
}
}
}