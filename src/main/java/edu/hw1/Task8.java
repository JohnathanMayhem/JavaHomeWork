package edu.hw1;

public class Task8 {

    private Task8() {

    }

    private final static int[][] MOVES =
        new int[][] {{-2, -1}, {-2, 1}, {2, 1}, {2, -1}, {-1, -2}, {-1, 2}, {1, 2}, {1, -2}};

    @SuppressWarnings("MagicNumber")
    public static boolean knightBoardCapture(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) {
                    for (int[] move : MOVES) {
                        if (i + move[0] >= 0 && i + move[0] < board.length && j + move[1] >= 0
                            && j + move[1] < board.length) {
                            if (board[i + move[0]][j + move[1]] != 0) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
