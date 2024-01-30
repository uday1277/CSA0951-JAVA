public class HollowBlockMatrix {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        int[][] hollowBlockMatrix = createHollowBlockMatrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(hollowBlockMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] createHollowBlockMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    matrix[i][j] = 1;
                }
            }
        }

        return matrix;
    }
}
