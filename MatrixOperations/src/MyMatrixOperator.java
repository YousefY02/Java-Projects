//Author: Yousef Yousef
//This class does different Matrix operations in each method
public class MyMatrixOperator {
    // Adds two n x n matrices and returns the result in another matrix
    public int[][] add(int[][] m1, int[][] m2) {
        int n = m1.length;
        int[][] result = new int[n][n];

        // Perform matrix addition
        for (int i = 0; i < n; i++) {
            //going through each row
            for (int j = 0; j < n; j++) {
                //going through each column j in that row i
                //Add value in row i and column j of each matrices then store it in matrix m3
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return result;
    }

    // Multiplies a matrix by a scalar and returns the result in another matrix
    public int[][] scalar(int s, int[][] m1) {
        int n = m1.length;

        // Perform scalar multiplication
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m1[i][j] = s * m1[i][j];
            }
        }
        return m1;
    }

    // Multiplies two n x n matrices and returns the result in another matrix
    public int[][] product(int[][] m1, int[][] m2) {
        int n = m1.length;
        int[][] m3 = new int[n][n];

        // Perform matrix multiplication
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                int temp = m1[i][k];
                for (int j = 0; j < n; j++) {
                    m3[i][j] += temp * m2[k][j];
                }
            }
        }
        return m3;
    }
}
