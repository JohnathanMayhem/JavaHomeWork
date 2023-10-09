package edu.hw1;

public class Task8 {

    private Task8() {

    }

    @SuppressWarnings("MagicNumber")
    public static boolean knightBoardCapture(int[][] board) {
        int[][] hit = new int[][] {{-2, -1}, {-2, 1}, {2, 1}, {2, -1}};
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) {
                    for (int k = 0; k < hit.length; k++) {
                        if (i + hit[k][0] >= 0 && i + hit[k][0] < board.length && j + hit[k][1] >= 0
                            && j + hit[k][1] < board.length) {
                            if (board[i + hit[k][0]][j + hit[k][1]] != 0) {
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
