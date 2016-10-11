class Pattern3 {
    public static void main() {
        int k=15;
        for(int i=1;i<=5;i++) {
         for(int j=5;j>=i;j--){ 
             System.out.print(k--+"\t");
          }
            System.out.println();    
    }
}
}