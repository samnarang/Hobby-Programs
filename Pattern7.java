class Pattern7 {
    public static void main() {
        int sp=4;
        for(int i=1;i<=4;i++) {
            for(int k=1;k<=sp;k++)
            System.out.print(" ");
            for(int j=1;j<=i;j++)
            System.out.print("* ");
            System.out.println();
            sp--;
        }
        
        
    }
}