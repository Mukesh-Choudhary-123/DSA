public class SpiralMatrix {

    public static void printSpiralMatrix(int matrix[][]) {
        int top = 0; // startRow

        int right = matrix[0].length - 1; // endCol

        int bottom = matrix.length - 1; // endRow

        int left = 0; // startCol

        while (top <= bottom && left <= right) {

            // top
            for (int i = top; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }

            // right
            for (int i = top + 1; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");

            }
            // bottom
            for (int i = right - 1; i >= left; i--) {
                System.out.print(matrix[bottom][i] + " ");
                if (top == bottom) {
                    break;
                }
            }

            // left
            for (int i = bottom - 1; i >= top + 1; i--) {
                System.out.print(matrix[i][left] + " ");
                if (left == right) {
                    break;
                }
            }
            top++;
            right--;
            bottom--;
            left++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        printSpiralMatrix(matrix);
    }
}
