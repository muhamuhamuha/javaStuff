public class TicTacToe {
    public static void main(String[] args) {
        
    }

    public class ttt {
        public static final int X = 1, O = -1;
        public static final int EMPTY = 0;

        public int player = X;
        private int[][] board = new int[3][3];
        public boolean isEmpty = false;

        /** Place an X or O at board position x, y */
        public void putSign(int x, int y) {
            if (x<0 || x >2 || y<0 || y>2) {
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

        /** Verifies if a player has one */
        public boolean isWin(int player) {
            boolean winWin = false;
            // sum rows
            for (int[] row : board) {
                if (Arrays.stream(row).sum() == player * 3)
                    winWin = true;  
            }

            // sum columns
            int r = 0, c = 0;
            while (r < board.length) {
                while (c < board[r].length) {
                    int[] cols = new int[board.length];
                    while (r < board.length && c < board[r].length) {
                        cols[r] = c;
                    }
                    if (Arrays.stream(cols).sum() == player * 3) {
                        winWin = true;
                        break;
                    }
                    r = 0;
                    c++;   
                }
                r++;
            }

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
                System.out.println("\n X wins!");
                isEmpty = false;
            }
            else if (isWin(O)) {
                System.out.println("\n O wins!");
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
                    s.append("\n---------------\n");
                }
            }
            return s.toString();
        }
    }
}