class Overload3 {
    void calculate(int m,char ch) {
        if(ch=='s') {
            if(m%7==0) 
            System.out.println("divisible by 7");
            else
            System.out.println("Not divisible by 7");
        }
        else if(m%10==7) 
            System.out.println("Last Digit is 7");
            else
            System.out.println("Last Digit is Not 7");
    }
    void calculate(int a,int b,char ch) {
        if(ch=='g')
            System.out.println("Greater Number = "+Math.max(a,b));
        else
            System.out.println("Smaller Number = "+Math.min(a,b));
    }
    public static void main(String args[]) {
        Overload3 x = new Overload3();
        x.calculate(47,'s');
        x.calculate(5,10,'g');
    }
}