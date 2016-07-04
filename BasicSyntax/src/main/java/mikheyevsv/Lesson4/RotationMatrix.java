package mikheyevsv.Lesson4;

/**
 * Created by Serg on 26.02.2016.
 */
public class RotationMatrix {
    private int n = 2;
    private int [][] matrix = new int[n][n];

    public int[][] rotationMatrix(int[][] matr){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = n*i + j;
            }
        }
        for (int k = 0; k < n / 2; k++) {
            for (int j = k; j < n - 1 -k; j++) {
                int temp = matrix[k][j];
                matrix[k][j] = matrix[j][n - 1 - k];
                matrix[j][n - 1 - k] = matrix[n - 1 - k][n - 1 - j];
                matrix[n - 1 - k][n - 1 - j] = matrix[n - 1 - j][k];
                matrix[n - 1 - j][k] = temp;
            }
        }
        return matr;
    }
}
///