class Pattern6 {
    public static void main() {
        for(int i=1;i<=9;i+=2) {
            for(int j=i;j<=9;j+=2) {
             System.out.print(j); 
            }
             for(int k=1;k<i;k+=2) {
             System.out.print(k);
            }
            System.out.println();
        }
    }
}