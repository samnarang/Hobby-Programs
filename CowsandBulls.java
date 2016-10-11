import java.util.Scanner;
class CowsandBulls {
    Scanner sc = new Scanner(System.in);
    String player1,player2;
    int num1,num2;
    int number_of_players;
    int level;
    int guess_count[] = new int[2];
    int guess[][][] = new int[2][100][3];
    int n1[] = new int[4];
    int n2[] = new int[4];
    boolean gameover = false;
    private void input() {
        leaveSpace();
        System.out.println("Enter number of players");
        number_of_players = sc.nextInt();
        sc.nextLine();
        while(!(number_of_players == 1 || number_of_players == 2)) {
            System.out.println("Only 1 or 2 players can play the game of Cows & Bulls");
            number_of_players = sc.nextInt();
            sc.nextLine();
        }
        leaveSpace();
        System.out.println("Player 1, Enter Your Name");
        player1 = sc.nextLine();
        if(number_of_players == 2) {
            leaveSpace();
            System.out.println("Player 2, Enter Your Name");
            player2 = sc.nextLine();
        }
        else {
            player2 = "Computer";
            leaveSpace();
            System.out.println("Enter level(1 for Easy, 2 for Hard)");
            level = sc.nextInt();
        }
        leaveSpace();
        System.out.println(player1 + ", Enter Your 4-Digit Number");
        num1 = sc.nextInt();
        while(!isValid(num1,1))
            num1 = sc.nextInt();
        leaveSpace();
        if(number_of_players == 2) {
            System.out.println(player2 + ", Enter Your 4-Digit Number");
            num2 = sc.nextInt();
            while(!isValid(num2,2))
                num2 = sc.nextInt();
        }
        else {
            num2 = randomWithRange(1000,9999);
            while(!isValid(num2,3)) {
                num2 = randomWithRange(1000,9999);
            }
        }
        leaveSpace();
    }
    private int randomWithRange(int min, int max) {
        int range = (max - min) + 1;
        return (int)((Math.random() * range) + min);
    }
    private boolean isValid(int num,int player) {
        if(num < 1000 || num > 9999) {
            System.out.println("The Number Should Be Of 4-Digits");
            return false;
        }
        int i,j;
        int digits[] = new int[4];
        digits = separate(num);
        for(i = 0; i <= 3; i++) {
            for(j = 0; j <= 3; j++) {
                if(digits[i] == digits[j] && i != j) {
                    if(player != 3)
                        System.out.println("Repetition Of Digits Is Not Allowed");
                    return false;
                }
            }
        }
        return true;
    }
    private int[] separate(int num) {
        int n[] = new int[4];
        for(int i = 3 ; i >= 0 ; i--) {
            n[i] = num%10;
            num /= 10;
        }
        return n;
    }
    private int getGuess(int player) {
        int g;
        g = sc.nextInt();
        while(!isValid(g,player))
            g = sc.nextInt();
        return g;
    }
    private int getAutomaticGuess() {
        int g = 0;
        if(level == 1) {
            while(!isValid(g,3)) {
                g = randomWithRange(1000,9999);
            }
        }
        if(level == 2) {
            while(!isValid(g,3) || !satisfiesConditions(g)) {
                g = randomWithRange(1000,9999);
            }
        }
        return g;
    }
    private boolean satisfiesConditions(int num) {
        for(int i = 0 ; i < guess_count[1] ; i++) {
            if(guess[1][i][1] != getCows(separate(num),separate(guess[1][i][0])))
                return false;
            if(guess[1][i][2] != getBulls(separate(num),separate(guess[1][i][0])))
                return false;
        }
        return true;
    }
    private int getCows(int n[],int g[])  {
        int c = 0;
        for(int i = 0 ; i <= 3 ; i++)
            if((g[i] == n[0] || g[i] == n[1] || g[i] == n[2] || g[i] == n[3]) && n[i] != g[i])
                c++;
        return c;
    }
    private int getBulls(int n[],int g[]) {
        int b = 0;
        for(int i = 0 ; i <= 3 ; i++)
            if(n[i] == g[i])
                b++;
        return b;
    }
    private void leaveSpace() {
        for(int i = 0 ; i < 100 ; i++) {
            System.out.println();
        }
    }
    private void tabulate() {
        leaveSpace();
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
        System.out.println("+");
        System.out.println("|Guess|Bulls|Cows|Guess|Bulls|Cows|");
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
        System.out.println("+");
        int guess_number;
        for(guess_number = 0 ; guess_number < guess_count[1] ; guess_number++) {
            System.out.println("|" + guess[0][guess_number][0] + " |  " + guess[0][guess_number][2] + "  | " + guess[0][guess_number][1] + "  |" + guess[1][guess_number][0] + " |  " + guess[1][guess_number][2] + "  | " + guess[1][guess_number][1] + "  |");
        }
        if(guess[0][guess_number][0] != 0 && gameover) {
            System.out.println("|" + guess[0][guess_number][0] + " |  " + guess[0][guess_number][2] + "  | " + guess[0][guess_number][1] + "  |  -  |  -  | -  |");
        }
        else if(guess[0][guess_number][0] != 0) {
            System.out.println("|" + guess[0][guess_number][0] + " |  " + guess[0][guess_number][2] + "  | " + guess[0][guess_number][1] + "  |");
        }
        if(gameover) {
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
            System.out.println("+");
        }
    }
    public void main() {
        input();
        n1 = separate(num1);
        n2 = separate(num2);
        int player = 1, current_guess;
        int g[] = new int[4];
        if(number_of_players == 2) {
            while(true){
                if (player == 1)
                    System.out.println(player1 + ", Enter Your Guess");
                else
                    System.out.println(player2 + ", Enter Your Guess");
                current_guess = guess[player-1][guess_count[player-1]][0] = getGuess(player);
                g = separate(current_guess);
                if(player == 1) {
                    guess[0][guess_count[0]][1] = getCows(g,n2);
                    guess[0][guess_count[0]][2] = getBulls(g,n2);
                }
                else if(player == 2) {
                    guess[1][guess_count[1]][1] = getCows(g,n1);
                    guess[1][guess_count[1]][2] = getBulls(g,n1);
                }
                guess_count[player - 1]++;
                tabulate();
                player = 3 - player;
                if(gameover && player == 2)
                    break;
            }
        }
        else {
            while(true) {
                if (player == 1) {
                    System.out.println(player1 + ", Enter Your Guess");
                    current_guess = guess[0][guess_count[0]][0] = getGuess(player);
                    g = separate(current_guess);
                    guess[0][guess_count[0]][1] = getCows(g,n2);
                    guess[0][guess_count[0]][2] = getBulls(g,n2);
                    if(guess[0][guess_count[0]][2] == 4)
                        gameover = true;
                    guess_count[player - 1]++;
                }
                else {
                    current_guess = guess[1][guess_count[1]][0] = getAutomaticGuess();
                    g = separate(current_guess);
                    guess[1][guess_count[1]][1] = getCows(g,n1);
                    guess[1][guess_count[1]][2] = getBulls(g,n1);
                    if(guess[1][guess_count[1]][2] == 4)
                        gameover = true;
                    guess_count[player - 1]++;
                    tabulate();
                }
                player = 3 - player;
                if(gameover && player == 1) {
                    break;
                }
            }
        }
        System.out.println("Player 1 : " + guess[0][guess_count[0]-1][2]);
        System.out.println("Player 2 : " + guess[1][guess_count[1]-1][2]);
        if(guess[0][guess_count[0]-1][2] == 4 && guess[1][guess_count[1]][2] == 4)
            System.out.println("It's a tie!");
        else if(guess[0][guess_count[0]-1][2] == 4)
            System.out.println(player1 + " Wins");
        else
            System.out.println(player2 + " Wins");

        System.out.println(player1 + "\'s number was " + num1);
        System.out.println(player2 + "\'s number was " + num2);
    }
}