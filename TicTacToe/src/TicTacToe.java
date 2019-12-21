import java.util.Arrays;
import java.util.Scanner;
import java.time.LocalTime;


public class TicTacToe {

    public static void main(String[] args) {
        System.out.println("---\n" 
        + LocalTime.now() + "\n---\n");
        
        
        ttt t = new ttt();
        System.out.println("Invoke! Caw caw! Invoke!");
        System.out.println("A new game hath been invokethed.");
        Scanner kScan = new Scanner(System.in);

        int x = 0, y = 0;
        do {
            System.out.println(t.player == t.X ? "Player X turn" : "Player O turn");
            System.out.println("Enter x and y coordinates");
            System.out.println(t.toString());
            x = kScan.nextInt();
            y = kScan.nextInt();

            t.putSign(x, y);
            System.out.println(t.toString());
            System.out.println("____________");
            t.displayWinner();
        } while (t.isEmpty);
        kScan.close();
    }

    public static class ttt {

        public static final int X = 1, O = -1;
        public static final int EMPTY = 0;

        public int player = X;
        public static int[][] board = new int[3][3];
        public boolean isEmpty = false;

        // constructor flushes board
        public ttt() {
            board = new int[3][3];
        }

        /** Place an X or O at board position x, y */
        public void putSign(int x, int y) {
            if (x < 0 || x > 2 || y < 0 || y > 2) {
                System.out.println("That positon doth not "
                    + "existeth on these boaaarrrrrdss");
                return;
            }
            if (board[x][y] != EMPTY) {
                System.out.println("That positon hath alreadyieth "
                    + "been reservedlied.");
                return;
            }
            board[x][y] = player;  // place current player's mark
            player = -player;  // switch players b/c O = -X
        }

        /** Verifies if player wins by row */
        public static boolean rowWin(int player) {
            int sumRow = 0;
            boolean winWin = false;
            for (int[] row : board) {
                sumRow = Arrays.stream(row).sum();
                if (sumRow == player * 3) {
                    winWin = true;
                    break;
                }
            }
            return winWin;
        }

        /** Will decide if player wins columnally */
        public static boolean colWin(int player) {
            boolean winWin = false;
            
            for(int row = 0; row < 3; row++) {
                int sumCol = 0;
                for (int col = 0; col < 3; col++) {
                   sumCol += board[col][row];
                   if (sumCol == player * 3) {
                       winWin = true;
                       break;
                   }
               }
            }
            return winWin;
        }

        public boolean isWin(int player) {
            boolean winWin = false;
    
            // sum rows
            if (rowWin(player) == true)
                winWin = true;

            // sum columns
            if (colWin(player) == true)
                winWin = true;

            // sum diagonals from top left
            int sumLDiag = 0;
            for (int i = 0; i < board.length; i++)
                sumLDiag += board[i][i];
            if (sumLDiag == player * 3)
                winWin = true;

            // sum diagonals from top right
            int len = board.length - 1, sumRDiag = 0;
            for (int i = 0; i < board.length; i++)
                sumRDiag += board[i][len--];
            if (sumRDiag == player * 3)
                winWin = true;
        
        return winWin;
        }

        /** Display winner or tie or unfinished game */
        public void displayWinner() {
            if (isWin(X)) {
                System.out.println("\nX wins!");
                isEmpty = false;
            }
            else if (isWin(O)) {
                System.out.println("\nO wins!");
            } else {
                if (!isEmpty) {
                    System.out.println("Tied.");
                }
            }
        }

        public String toString() {
            StringBuilder s = new StringBuilder();
            isEmpty = false;
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {

                    switch (board[i][j]) {
                        case X: 
                            s.append(" X ");
                            break;
                        case O:
                            s.append(" O ");
                            break;
                        case EMPTY:
                            s.append("   ");
                            isEmpty = true;
                            break;
                    }
                    if (j < 2) {
                        s.append("|");
                    }
                }
                if (i < 2) {
                    s.append("\n------------\n");
                }
            }
            return s.toString();
        }
    }
}