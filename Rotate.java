public class Rotate {

    public static int[][] rotateArray(int[][] grid) {
        int[][] next = new int[grid.length][grid.length];

        int row = 0;
        int col = 0;
        for (int c = 0; c < grid.length; c++) {
            for (int r = grid.length - 1; r >= 0; r--) {
                next[row][col] = grid[r][c];
                col++;
            }
            col = 0;
            row++;
        }
        return next;
    }
}