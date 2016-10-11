import java.util.Scanner;
class CowsandBulls2 {
    Scanner sc = new Scanner(System.in);
    String player1,player2;
    int num1,num2;
    int n1[] = new int[4];
    int n2[] = new int[4];
    boolean gameover = false;
    private void input() {  
        System.out.println("Player 1, Enter Your Name");
        player1 = sc.nextLine();
        System.out.println("Player 2, Enter Your Name");
        player2 = sc.nextLine();
        
        //TODO: Password Input
        System.out.println(player1 + ", Enter Your 4-Digit Number");
        num1 = sc.nextInt();
        while(!isValid(num1))
            num1 = sc.nextInt();
        System.out.println(player2 + ", Enter Your 4-Digit Number");
        num2 = sc.nextInt();
        while(!isValid(num2))
            num2 = sc.nextInt();
    }
    private boolean isValid(int num) {
        if(num < 1000 || num > 9999) {
            System.out.println("The Number Should Be Of 4-Digits");
            return false;
        }
        int i,j;    
        int digits[] = new int[4];
        digits = seperate(num);
        for(i = 0; i <= 3; i++) {
            for(j = 0; j <= 3; j++) {
                if(digits[i] == digits[j] && i != j) {
                    System.out.println("Repetition Of Digits Is Not Allowed");
                    return false;
                }
            }
        }
        return true;
    }
    private int[] seperate(int num) {
        int n[] = new int[4];
        for(int i = 3 ; i >= 0 ; i--) {
            n[i] = num%10;
            num /= 10;
        }
        return n;
    }
    private int getGuess() { //TODO: add check
        int g;
        g = sc.nextInt();
        while(!isValid(g))
            g = sc.nextInt();
        return g;
    }
    private void getBulls(int n[],int g[]) {
        int b = 0;
        for(int i = 0 ; i <= 3 ; i++) 
            if(n[i] == g[i]) 
                b++;
        System.out.print("B = " + b);
        if(b == 4)
            gameover = true;
    }
    private void getCows(int n[],int g[])  {  
        int c = 0;
        for(int i = 0 ; i <= 3 ; i++)
            if((g[i] == n[0] || g[i] == n[1] || g[i] == n[2] || g[i] == n[3]) && n[i] != g[i])
                c++;
        System.out.println("C = " + c);
    }
    private void tabulate() {
        int i,j,k,s1,s2;
        System.out.print("+");
        if(player1.length() > player2.length())
            i = player1.length();
        else
            i = player2.length();
        if(i < 16)
            i = 16;
        s1 = (i-(player1.length()))/2;
        s2 = (i-(player2.length()))/2;
        
        //TODO: Efficiency check
        for(j = 0 ; j < i; j++) 
            System.out.print("-");
        System.out.print("+");
        for(j = 0; j < i ; j++) 
            System.out.print("-");
        System.out.println("+");
        System.out.print("|");
        for(k = 0; k < s1; k++)
            System.out.print(" ");
        System.out.print(player1);
        for(k = 0; k < (i-s1-player1.length()); k++)
            System.out.print(" ");
        System.out.print("|");
        for(k = 0; k < s2; k++)
            System.out.print(" ");
        System.out.print(player2);    
        for(k = 0; k < (i-s2-player2.length()); k++)
            System.out.print(" ");
        System.out.println("|");
        System.out.print("+");
        for(j = 0 ; j < i ; j++) 
            System.out.print("-");
        System.out.print("+");
        for(j = 0; j < i ; j++) 
            System.out.print("-");
        System.out.println("+");
        /* System.out.println("|Guess|Bulls|Cows|Guess|Bulls|Cows|");
        for(k = 0; k < 2; k++) {
            System.out.print("+");
            for(j = 0; j < 5; j++)
                System.out.print("-");
            System.out.print("+");
            for(j = 0; j < 5; j++)
                System.out.print("-");
            System.out.print("+");    
            for(j = 0; j < 4; j++)
                System.out.print("-");
        }
        System.out.println("+");*/ 
    }
    public void main() {
        input();
        tabulate();
        n1 = seperate(num1);
        n2 = seperate(num2);
        int player = 1 , guess;
        int g[] = new int[4];
        while(true){
            if (player == 1)
                System.out.println(player1 + ", Enter Your Guess");
            else
                System.out.println(player2 + ", Enter Your Guess");
            guess = getGuess();
            g = seperate(guess);
            if(player == 1) {
                getBulls(g,n2);
                getCows(g,n2);
            }
            else if(player == 2) {
                getBulls(g,n2);
                getCows(g,n2);
            }
            player = 3 - player;
            if(gameover) 
                break;           
        } 
        if(player == 1)
            System.out.println(player2 + " Wins");
        else
            System.out.println(player1 + " Wins");
    }
}